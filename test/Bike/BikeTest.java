package test.Bike;
/**
 * class for BikeTest
 */

import Bike.Bike;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    
    private Bike bike;

    @BeforeEach
    public void init() {
        bike = new Bike("test");
    }

    @Test
    public void testGetBikeId() {
        assertEquals("test", bike.getBikeId());
    }

    @Test
    public void testGetNbUsage() {
        assertEquals(0, bike.getNbUsage());
    }

    @Test
    public void testIncrementNbUsage() {
        bike.incrementNbUsage();
        assertEquals(1, bike.getNbUsage());
    }

    @Test
    public void testDecrementNbUsage() {
        bike.incrementNbUsage();
        assertEquals(1, bike.getNbUsage());
        bike.decrementNbUsage();
        assertEquals(0, bike.getNbUsage());
    }

    @Test
    public void testEquals() {
        Bike bike2 = new Bike("test");
        assertTrue(bike.equals(bike2));
    }
}
