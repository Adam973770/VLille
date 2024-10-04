package VLille.Bike;

/**
 * class for ElectricBike
 */
public class ElectricBike extends Bike {

    /** number of maximum usage for an electric bike */
    public static final int LIMIT_OF_USAGE = 8;

    /**
     * Build a Classical Bike
     * @param Id the identifier of the Classical Bike
     */
    public ElectricBike(String ElectricBikeId) {
        super(ElectricBikeId);
    }

}
