package test.VLille.vehicle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;

public abstract class VehicleTest{
    protected Vehicle vehicle;

    protected abstract Vehicle createVehicle();

    @BeforeEach
    public void init(){
        this.vehicle = createVehicle();
    }

    @Test 
    public void vehicleIsNotRentedWhenInitialized(){
        assertEquals(this.vehicle.getState(), "Not rented");
    }

    @Test 
    public void vehicleIsRented(){
        this.vehicle.rented();
        assertEquals(this.vehicle.getState(), "Rented");
    }

    @Test
    public void vehicleIsNotRented(){
        this.vehicle.notRented();
        assertEquals(this.vehicle.getState(), "Not rented");
    }

    @Test
    public void vehicleIsBroken(){
        this.vehicle.broken();
        assertEquals(this.vehicle.getState(), "Broken");
    }

    @Test
    public void vehicleIsStealed(){
        this.vehicle.stealed();
        assertEquals(this.vehicle.getState(), "Stealed");
    }

    @Test
    public void vehicleIsNotRentedThenRentedThenBrokenThenStealed(){
        assertEquals(this.vehicle.getState(), "Not rented");
        this.vehicle.rented();
        assertEquals(this.vehicle.getState(), "Rented");
        this.vehicle.broken();
        assertEquals(this.vehicle.getState(), "Broken");
        this.vehicle.stealed();
        assertEquals(this.vehicle.getState(), "Stealed");
    }

    @Test
    public void vehicleNumberOfUsageRemainingBeforeBrokenCheckWhenInitialize(){
        assertEquals(this.vehicle.getNbUsage(), 5);
    }

    @Test
    public void vehicleIntervaleBeforeVehicleCanBeStealCheckWhenInitialize(){
        assertEquals(this.vehicle.getIntervaleBeforeSteal(), 2);
    }

    @Test 
    public void noUserHaveThisBike(){
        assertEquals(this.vehicle.getCurrentRenter(), null);
    }
}