package BikeStation;
import java.util.*;
import Bike.Bike;
/**
 * class for a BikeStation
 */
public class BikeStation{
    
    /** the Id of the BikeStation*/
    protected String BikeStationId;
    
    /** The Bikes in the BikeStation */
    protected List<Bike> theBikes;

    /** The number of Bikes in this BikeStation */
    protected int capacity = this.generateRandonCapacity();

    /**
     * Constructor of the BikeStation
     * @param BikeStationId the Id of the BikeStation
     */
    public BikeStation (String BikeStationId){ 
       this.BikeStationId = BikeStationId;
       this.theBikes = new ArrayList<Bike>(this.capacity);
       for(int i = 0; i < this.capacity; i++) {
            this.getTheBikes().add(new Bike("Bike" + i));
       }
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

    /**permet d'obtenir le premier emplacement libre de la bikeStation */
    public int firstFreeSlot(){
        int i;
        for (i=0; i<this.getCapacity; i++){
            if (this.theBikes.get(i)!=null){
                return i;
            }
        }
        return -1;
    }
    /**permet d'ajouter un bike a la station */
    public void addBike(Bike bike){
        if (firstFreeSlot()!=-1){
            this.theBikes.add(firstFreeSlot());
        }
    }

    /**permet d'enlever un bike de la station */
    public void removeBike(int b) throws bikeNotInBikeStationException {
        if (b > this.getCapacity){
            System.out.println("out of range");
        }
        if (this.theBikes.get(b)==null){
            throw bikeNotInBikeStationException();
        }
        this.theBikes.remove(b);
    }
}