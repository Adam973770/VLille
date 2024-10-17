package VLille.vehicle.Bike;
import VLille.vehicle.*;

public class ElectricBike extends Bike {
        
    public static final int LIMIT_OF_USAGE = 5;

    public ElectricBike(String electricBikeId) {
        this.libelle = "Electric Bike ";
        this.bikeId = electricBikeId;
        this.nbUsage = 0;
    }
}