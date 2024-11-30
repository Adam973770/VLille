/**
 * The `Basket` class is a decorator for the `Bike` class, which adds the functionality of a basket to a bike.
 * This class is part of the decorator pattern used to dynamically add functionality to bikes in the VLille system.
 * 
 * The `Basket` class extends `DecorateurBike`, which allows it to "decorate" or enhance a `Bike` object
 * by adding new behavior while keeping the core functionality of the bike intact.
 */
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