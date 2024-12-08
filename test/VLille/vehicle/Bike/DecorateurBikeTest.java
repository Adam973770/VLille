package test.VLille.vehicle.Bike;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;

public abstract class DecorateurBikeTest {
    protected Bike bike;

    @BeforeEach
    public void init(){
        this.bike = createBike();
    }

    protected abstract Bike createBike();
}