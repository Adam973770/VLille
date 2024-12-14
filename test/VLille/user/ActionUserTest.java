package test.VLille.user;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.Station.*;
import src.VLille.Exceptions.*;
import src.VLille.controlCenter.*;
import src.VLille.user.*;
import java.util.*;

public class ActionUserTest {

    private MockStation station; //Utiliser un mock pour verifier les appels des methodes de Station, (dropVehicle et takeVehicle)
    private ControlCenter controlCenter;
    private Renter renter;
    private Thief thief;
    private Repairer repairer;
    private Painter painter;
    private Vehicle bike1;
    private Vehicle bike2;
    private ActionUser action;

    @BeforeEach
    public void init() throws StationIsFullException{
        this.controlCenter = ControlCenter.getInstance();
        this.station = new MockStation(this.controlCenter);
        this.controlCenter.addStation(this.station);
        this.painter = new Painter.PainterBuilder().setFirstName("Jeanne").setGender("Femme").build();
        this.renter = new Renter.RenterBuilder().setFirstName("Theo").setGender("Homme").build();
        this.thief = new Thief.ThiefBuilder().setFirstName("Leo").setGender("Homme").build();
        this.repairer = new Repairer.RepairerBuilder().setFirstName("Theophane").setGender("Homme").build();
        this.bike1 = new ClassicBike();
        this.bike2 = new ElectricBike();
        this.station.dropVehicle(this.bike1);
        this.station.dropVehicle(this.bike2);
        this.station.count = 0;
        this.action = new MockActionUser();
    }

    @Test
    public void aPainterCanPaintAVehicle(){
        assertEquals(this.bike1.getColor(), "red");
        action.paint(this.painter, this.bike1, "Blue");
        assertEquals(this.bike1.getColor(), "Blue");
    }

    @Test
    public void aVehicleCanBeRentOrDropInAStation() throws StationIsAlreadyEmpty, StationIsFullException{
        assertEquals(this.station.getCount(), 0);
        action.rent(this.renter, this.station);
        assertEquals(this.renter.getOwnedVehicle(), this.bike1);
        assertEquals(this.bike1.getNbUsage(), 4);
        assertEquals(this.bike1.getState(), "Rented");
        action.drop(this.renter, this.station);
        assertEquals(this.bike1.getState(), "Not rented");
        assertEquals(this.station.getCount(), 2);
    }

    @Test
    public void aVehicleCanBeBrokeThenRepairByARepairer() throws StationIsAlreadyEmpty, StationIsFullException{
        assertEquals(this.bike1.getNbUsage(), 5);
        this.bike1.setNbUsage(1);
        action.rent(this.renter, this.station);
        assertEquals(this.bike1.getState(), "Rented");
        action.drop(this.renter, this.station);
        assertEquals(this.bike1.getState(), "Broken");
        action.repair(this.repairer, this.bike1);
        assertEquals(this.bike1.getState(), "Not rented");
        assertEquals(this.station.getCount(), 2);
    }

    @Test
    public void anyUserCanRentAVehicle() throws StationIsAlreadyEmpty, StationIsFullException{
        action.rent(this.renter, this.station);
        assertEquals(this.renter.getOwnedVehicle(), this.bike1);
        action.drop(this.renter, this.station);
        assertEquals(this.renter.getOwnedVehicle(), null);
        action.rent(this.painter, this.station);
        assertEquals(this.painter.getOwnedVehicle(), this.bike1);
        action.drop(this.painter, this.station);
        assertEquals(this.painter.getOwnedVehicle(), null);
        action.rent(this.thief, this.station);
        assertEquals(this.thief.getOwnedVehicle(), this.bike1);
        action.drop(this.thief, this.station);
        assertEquals(this.thief.getOwnedVehicle(), null);
        action.rent(this.repairer, this.station);
        assertEquals(this.repairer.getOwnedVehicle(), this.bike1);
        action.drop(this.repairer, this.station);
        assertEquals(this.repairer.getOwnedVehicle(), null);
        assertEquals(this.station.getCount(), 8);
    }

    @Test
    public void thiefStealAVehicleInAStation() throws StationIsAlreadyEmpty, StationIsFullException{
        this.bike1.setIntervaleBeforeSteal(0);
        action.steal(this.thief, this.controlCenter.getAllBikeStation());
        assertTrue(this.thief.getVehiclesteal().contains(this.bike1));
        assertEquals(this.bike1.getState(), "Stealed");
    }

    public class MockStation extends Station{
        private int count;

        public MockStation(ControlCenter controlCenter){
            super(controlCenter);
            this.count = 0;
        }

        public int getCount(){
            return this.count;
        }

        @Override
        public void dropVehicle(Vehicle v) throws StationIsFullException{
            this.count++;
            super.dropVehicle(v);
        }

        @Override
        public Vehicle takeVehicle() throws StationIsAlreadyEmpty{
            this.count++;
            return super.takeVehicle();
        }
    }

    public class MockActionUser extends ActionUserlmpl{
        public MockActionUser(){
            super();
        }
        
        @Override
        public void steal(Thief thief, List<Station> stations){
            for (Station station : stations){
                for (int i = 0; i < station.getCapacity(); i++){
                    Vehicle vehicle = station.getAllVehicle().get(i);
                    if (vehicle != null && vehicle.getIntervaleBeforeSteal() == 0){
                        vehicle.stealed();
                        thief.getVehiclesteal().add(vehicle);
                        station.getAllVehicle().set(i, null);
                    }
                }
            }
        }
    }
}