package VLille.vehicle.Bike;
import VLille.vehicle.*;
public abstract class Bike extends Vehicle {

    public String toString() { 
        return getLibelle() + "Id Bike : " + getVehicleId() + ", Nombre d'usage restant : " + getNbUsage(); 
    }
}