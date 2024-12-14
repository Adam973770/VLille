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

    @BeforeEach
    public void init() throws StationIsFullException{
        this.controlCenter = ControlCenter.getInstance();
        this.station = new Station(this.controlCenter);
        this.bike1 = new ClassicBike();
        this.bike2 = new ElectricBike();
        this.bike3 = new ClassicBike();

        this.station.dropVehicle(this.bike1);
        this.station.dropVehicle(this.bike2);
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
}