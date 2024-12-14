package src.VLille.vehicle.Bike;

/**
 * This class serves as a factory responsible for creating a certain type of Bike Object
 */
public abstract class BikeFactory {

    /**
     * Method use to create a specific Bike Object
     * 
     * @return the bike that has been create
     */
    public abstract Bike createBike();
}