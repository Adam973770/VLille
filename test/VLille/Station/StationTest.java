package test.VLille.Station;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.Station.*;
import src.VLille.Exceptions.*;
import src.VLille.controlCenter.*;

public class StationTest {

    private Station station;
    private ControlCenter controlCenter;
    private Vehicle bike1;
    private Vehicle bike2;
    private Vehicle bike3;
    private MockStationObserver observer;

    @BeforeEach
    public void init() throws StationIsFullException{
        this.controlCenter = ControlCenter.getInstance();
        this.station = new Station(this.controlCenter);
        this.bike1 = new ClassicBike();
        this.bike2 = new ElectricBike();
        this.bike3 = new ClassicBike();
        this.station.dropVehicle(this.bike1);
        this.station.dropVehicle(this.bike2);
        this.observer = new MockStationObserver();
        this.station.addStationObserver(this.observer);
    }

    @Test 
    public void shouldThrowEmptyException() throws StationIsAlreadyEmpty {
        this.station.takeAllVehicle();
        assertTrue(this.station.isEmpty());
        assertThrows(StationIsAlreadyEmpty.class, () -> this.station.takeAllVehicle());
    }

    @Test
    public void bikeHasBeenDropInTheStation() throws StationIsFullException{
        assertEquals(this.station.getAllVehicle().get(2), null);
        this.station.dropVehicle(this.bike3);
        assertEquals(this.station.getAllVehicle().get(2), this.bike3);
    }

    @Test
    public void stationHasACapacitySuperiorOrEqualsAtTenAndHasACOntrolCenter(){
        assertTrue(this.station.getAllVehicle().size() >= 10);
        assertEquals(this.station.getControlCenter(), this.controlCenter);
    }

    @Test 
    public void checkTheFullException() throws StationIsFullException{
        this.station.setCapacity(2);
        assertEquals(this.station.getCapacity(), this.station.getAllVehicle().size(), 2);
        assertThrows(StationIsFullException.class, () -> this.station.dropVehicle(this.bike3));       
    }

    @Test 
    public void checkIfUpdateHasBeenCorrectlyImplementedWithTheMock() throws StationIsFullException, StationIsAlreadyEmpty{
        this.station.dropVehicle(this.bike3);
        assertEquals(this.observer.getCount(), 1);
        this.station.takeVehicle();
        assertEquals(this.observer.getCount(), 2);
    }

    public class MockStationObserver implements StationObserver{
        private int count;

        public MockStationObserver(){
            this.count = 0;
        }

        public int getCount(){
            return this.count;
        }

        @Override
        public void update(Station station, String event, Vehicle vehicle){
            this.count++;
            switch (event) {
            case "Vehicle has been take":
                System.out.println("ControlCenter : A vehicle has been taked in " + station.getId());
                break;
            case  "Vehicle has been drop":
                System.out.println("ControlCenter : A vehicle has been droped in " + station.getId());
                break;
            }
        }
    }
}