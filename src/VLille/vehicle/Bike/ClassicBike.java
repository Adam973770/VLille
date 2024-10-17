package VLille.vehicle.Bike;
import VLille.vehicle.*;

public class ClassicBike extends Bike {
        
    public static final int LIMIT_OF_USAGE = 5;

    public ClassicBike(String classicBikeId) {
        this.libelle = "Classic Bike ";
        this.bikeId = classicBikeId;
        this.nbUsage = 0;
    }
}
