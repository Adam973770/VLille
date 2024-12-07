package test.VLille.vehicle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;

public class ClassicBikeTest extends BikeTest {

    @Override
    protected Vehicle createVehicle(){
        return new ClassicBike();
    }
}