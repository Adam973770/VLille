package VLille.vehicle.Bike.equipment;
import VLille.vehicle.*;
import VLille.vehicle.Bike.*;

public class Basket extends DecorateurBike {
    public Basket (Bike b){
        bike = b;
    }

    public String getLibelle() {
        return bike.getLibelle() + "+ Basket ";
    }
}