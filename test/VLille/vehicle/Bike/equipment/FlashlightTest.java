package test.VLille.vehicle.Bike.equipment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.vehicle.Bike.equipment.*;

import test.VLille.vehicle.Bike.*;

public class FlashlightTest extends DecorateurBikeTest {

    @Override
    public Bike createBike(){
        return new ClassicBike();
    }

    @Test 
    public void bikeHasBeenDecorateWithABasket(){
        this.bike = new Flashlight(this.bike);
        assertEquals(this.bike.getLibelle(), "Classic Bike + Flashlight ");
    }
}
