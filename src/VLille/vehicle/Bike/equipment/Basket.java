package VLille.vehicle.Bike.equipment;
import VLille.vehicle.*;
import VLille.vehicle.Bike.*;

/**
 * The `Basket` class is a decorator for the `Bike` class
 */
public class Basket extends DecorateurBike {

    /**
     * Constructs a new `Basket` decorator for the specified `Bike` object.
     * 
     * @param b The `Bike` object that is being decorated with a Basket.
     */
    public Basket (Bike b){
        bike = b;
    }

    /**
     * Returns the label (libelle) of the bike with the added information about the basket.
     * 
     * @return A string representing the bike's label, which now includes "+ Basket".
     */
    public String getLibelle() {
        return bike.getLibelle() + "+ Basket ";
    }
}