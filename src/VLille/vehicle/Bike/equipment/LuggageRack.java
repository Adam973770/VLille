/**
 * The `LuggageRack` class is a decorator for the `Bike` class, which adds the functionality of a luggageRack to a bike.
 * This class is part of the decorator pattern used to dynamically add functionality to bikes in the VLille system.
 * 
 * The `LuggageRack` class extends `DecorateurBike`, which allows it to "decorate" or enhance a `Bike` object
 * by adding new behavior while keeping the core functionality of the bike intact.
 */
package src.VLille.vehicle.Bike.equipment;
import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;

/**
 * The `LuggageRack` class is a decorator for the `Bike` class
 */
public class LuggageRack extends DecorateurBike {

    /**
     * Constructs a new `LuggageRack` decorator for the specified `Bike` object.
     * 
     * @param b The `Bike` object that is being decorated with a LuggageRack.
     */
    public LuggageRack (Bike b){
        bike = b;
    }

    /**
     * Returns the label (libelle) of the bike with the added information about the luggageRack.
     * 
     * @return A string representing the bike's label, which now includes "+ LuggageRack".
     */
    public String getLibelle() {
        return super.getLibelle() + "+ LuggageRack ";
    }
}