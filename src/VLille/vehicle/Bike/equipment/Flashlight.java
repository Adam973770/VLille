package VLille.vehicle.Bike.equipment;
import VLille.vehicle.*;
import VLille.vehicle.Bike.*;

public class Flashlight extends DecorateurBike {
    public Flashlight (Bike b){
        bike = b;
    }

    public String getLibelle() {
        return bike.getLibelle() + "+ Flashlight ";
    }
}