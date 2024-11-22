package VLille.vehicle.Bike.equipment;
import VLille.vehicle.*;
import VLille.vehicle.Bike.*;

/**
 * The `Flashlight` class is a decorator for the `Bike` class
 */
public class Flashlight extends DecorateurBike {

    /**
     * Constructs a new `Flashlight` decorator for the specified `Bike` object.
     * 
     * @param b The `Bike` object that is being decorated with a Flashlight.
     */
    public Flashlight (Bike b){
        bike = b;
    }

    /**
     * Returns the label (libelle) of the bike with the added information about the flashlight.
     * 
     * @return A string representing the bike's label, which now includes "+ Flashlight".
     */
    public String getLibelle() {
        return bike.getLibelle() + "+ Flashlight ";
    }
}