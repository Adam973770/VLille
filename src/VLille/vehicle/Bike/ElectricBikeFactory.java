package src.VLille.vehicle.Bike;

/**
 * This class serves as a factory responsible for creating a ElectricBike Object
 */
public class ElectricBikeFactory extends BikeFactory {

    /**
     * Method use to create an ElectricBike Object
     * 
     * @return the bike that has been create
     */
    @Override
    public Bike createBike() {
        return new ElectricBike();
    }
}