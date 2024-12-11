package src.VLille.vehicle.Bike;
import src.VLille.vehicle.*;

/**
 * Abstract class for `DecorateurBike`, representing a decorator for an Object Bike, allowing modifications to a Bike object
 */
public abstract class DecorateurBike extends Bike {

    /**
     * The bike being decorated 
     */
    protected Bike bike;
    
    /**
     * Retrieves the label of the decorated bike
     * 
     * @return The current label of a bike
     */
    public String getLibelle(){
        return bike.getLibelle();
    }
}