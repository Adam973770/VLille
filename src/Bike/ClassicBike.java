package Bike;
/**
 * class for ClassicalBike 
 */
public class ClassicBike extends Bike {
    
    /** number of maximum usage for a classical bike */
    public static final int LIMIT_OF_USAGE = 5;

    /**
     * Build a Classical Bike 
     * @param Id the identifier of the Classical Bike
     */
    public ClassicBike(String classicBikeId) {
        super(classicBikeId);
    }
}
