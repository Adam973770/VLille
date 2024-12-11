package src.VLille.vehicle.Bike;

/**
 * This class serves as a factory responsible for creating a ClassicBike Object
 */
public class ClassicBikeFactory extends BikeFactory {

    /**
     * Method use to create a ClassicBike Object
     * 
     * @return the bike that has been create
     */
    @Override
    public Bike createBike() {
        return new ClassicBike();
    }
}