package BikeStation;
import java.util.*;
import Bike.Bike;
/**
 * class for a BikeStation
 */
public class BikeStation{
    
    /** the Id of the BikeStation*/
    private String BikeStationId;
    
    /** The Bikes in the BikeStation */
    private List<Bike> theBikes;

    /**
     * Constructor of the BikeStation
     * @param BikeStationId the Id of the BikeStation
     */
    public BikeStation (String BikeStationId){ 
       this.BikeStationId = BikeStationId;
       this.theBikes = new ArrayList<Bike>(this.generateRandonCapacity());
    }
    
    /**
     * Get the Id of the BikeStation
     * @return the Id of the BikeStation
     */
    public String getBikeStationId(){
        return this.BikeStationId;
    }

    /**
     * Get all the Bikes of this BikeStation
     * @return the Bikes of this BikeStation
     */
    public List<Bike> getTheBikes() {
        return this.theBikes;
    }

    /**
     * Get the capacity of the BikeStation
     * @return the capacity of the BikeStation
     */
    public int getCapacity() {
        return this.getTheBikes().size();
    }
 
    /**
     * Generate a random number between 10 and 20 for the capacity of the BikeStation
     * @return the capacity of the BikeStation
     */
    public int generateRandonCapacity() {
        Random random = new Random();
        int min = 10;
        int max = 20;

        // Générer un entier aléatoire entre min et max (inclus)
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Two BikeStations are equals if same Id 
     * @return true if equals, false if not
     */
    public boolean equals(Object o) {
        try {
            BikeStation Other = (BikeStation) o;
            return this.getBikeStationId().equals(Other.getBikeStationId());
        } catch (ClassCastException e) {
            return false;
        }
    }

    /**
     * Get a description of the BikeStation
     * @return a description of the BikeStation
     */
    public String toString() {
        return "BikeStation : " + this.getBikeStationId();
    }
}