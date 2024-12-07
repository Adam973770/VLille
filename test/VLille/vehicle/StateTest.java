package test.VLille.vehicle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;

public abstract class StateTest {
    protected State state;
    protected Vehicle vehicle;

    @BeforeEach
    public void init(){
        this.state = createState();
        this.vehicle = new ClassicBike();
        this.state.setVehicle(this.vehicle);
    }

    protected abstract State createState();

    @Test
    public void rentedStateChangeCheck(){
        this.state.rented();
        assertEquals(this.state.getStateDescription(), "Rented");
    }

    @Test
    public void notRentedStateChangeCheck(){
        this.state.notRented();
        assertEquals(this.state.getStateDescription(), "Not rented");
    }

    @Test
    public void brokenStateChangeCheck(){
        this.state.broken();
        assertEquals(this.state.getStateDescription(), "Broken");
    }

    @Test
    public void stealedStateChangeCheck(){
        this.state.stealed();
        assertEquals(this.state.getStateDescription(), "Stealed");
    }
}