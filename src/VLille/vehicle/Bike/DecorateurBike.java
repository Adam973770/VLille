package VLille.vehicle.Bike;
import VLille.vehicle.*;

public abstract class DecorateurBike extends Bike {
    protected Bike bike;

    public abstract String getLibelle();
    public abstract String getBikeId();
    public abstract int getNbUsage();

}