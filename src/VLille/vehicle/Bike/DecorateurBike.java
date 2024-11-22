package VLille.vehicle.Bike;
import VLille.vehicle.*;

/**
 * class for `DecorateurBike` Object
 */
public abstract class DecorateurBike extends Bike {
    protected Bike bike;

    public abstract String getLibelle();
}