/**
 * The `Bottle` class is a decorator for the `Bike` class, which adds the functionality of a bottle to a bike.
 * This class is part of the decorator pattern used to dynamically add functionality to bikes in the VLille system.
 * 
 * The `Bottle` class extends `DecorateurBike`, which allows it to "decorate" or enhance a `Bike` object
 * by adding new behavior while keeping the core functionality of the bike intact.
 */
package src.VLille.vehicle.Bike.equipment;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;

public class Bottle extends DecorateurBike {

    /**
     * Constructs a new `Bottle` decorator for the specified `Bike` object.
     * 
     * @param b The `Bike` object that is being decorated with a bottle.
     */
    public Bottle(Bike b) {
        bike = b;
    }

    @Override
    /**
     * Returns the label (libelle) of the bike with the added information about the bottle.
     * 
     * @return A string representing the bike's label, which now includes "+ Bottle".
     */
    public String getLibelle() {
        return super.getLibelle() + "+ Bottle ";
    }
}