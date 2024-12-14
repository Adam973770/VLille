package test.VLille.controlCenter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.Station.*;
import src.VLille.Exceptions.*;
import src.VLille.controlCenter.*;
import java.util.*;

public class ControlCenterTest {

    private ControlCenter controlCenter;
    private Station station1;
    private Station station2;
    private Vehicle bike1;
    private Vehicle bike2;
    private Vehicle bike3;

    @BeforeEach
    public void init(){
        this.controlCenter = ControlCenter.getInstance();
        this.station1 = new Station(this.controlCenter);
        this.station2 = new Station(this.controlCenter);
        this.controlCenter.addStation(this.station1);
        this.controlCenter.addStation(this.station2);
        this.bike1 = new ClassicBike();
        this.bike2 = new ElectricBike();
        this.bike3 = new ClassicBike();        
    } 

    @Test 
    public void singletonTest(){
        ControlCenter controlCenter2 = ControlCenter.getInstance();
        assertSame(this.controlCenter, controlCenter2);
    }

    @Test
    public void checkAddAndRemoveStation(){
        Station station = new Station(this.controlCenter);
        this.controlCenter.addStation(station);
        assertTrue(this.controlCenter.getAllBikeStation().contains(station));
        this.controlCenter.removeStation(station);
        assertFalse(this.controlCenter.getAllBikeStation().contains(station));
    }

    @Test
    public void checkStrategyIsSet(){
        assertTrue(this.controlCenter.getStrategy() != null);
        DistributionStrategy strat = new DistributionStrategylmpl();
        this.controlCenter.setStrategy(strat);
        assertEquals(this.controlCenter.getStrategy(), strat);
    }

    @Test 
    public void checkIfTheStationHasBeenAddToTheControlCenter(){
        List<Station> stations = this.controlCenter.getAllBikeStation();
        Station station = new Station(this.controlCenter);
        this.controlCenter.addStation(station);
        assertTrue(this.controlCenter.getAllBikeStation().contains(station));
    }
}