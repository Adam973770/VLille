package test.VLille.vehicle.Bike;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;

public class ElectricBikeTest extends BikeTest {
    
    @Override
    public Vehicle createVehicle(){
        return new ElectricBike();
    }
}