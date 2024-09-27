package test.BikeStation;
/**
 * class for BikeStationTes
 */
import BikeStation.BikeStation;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class BikeStationTest {
    
    private BikeStation bikeStation;

    @BeforeEach
    public void init() {
        bikeStation = new BikeStation("test");
    }

    @Test
    public void testGetBikeStationId() {
        assertEquals("test",bikeStation.getBikeStationId());
    }

    @Test
    public void testCapacityIsCorrect() {
        int min = 10;
        int max = 20;
        assertTrue(min <= bikeStation.getCapacity() && max > bikeStation.getCapacity());
    }

    @Test
    public void testEquals() {
        BikeStation bikeStation2 = new BikeStation("test");
        assertTrue(bikeStation.equals(bikeStation2));
    }
}
