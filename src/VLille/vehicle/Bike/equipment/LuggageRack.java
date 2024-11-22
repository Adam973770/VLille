package VLille.vehicle.Bike.equipment;
import VLille.vehicle.*;
import VLille.vehicle.Bike.*;

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
        return bike.getLibelle() + "+ LuggageRack ";
    }
}