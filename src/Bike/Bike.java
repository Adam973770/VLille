package Bike;
import java.util.*;
import util.*;
/**
 * class for a Bike 
 */
public class Bike {

    /** the Identifier of the bike */
    protected String BikeId;

    /** amount of usage of the bike */
    protected int nbUsage;

    /** List of all the equipments of this bike */
    protected List<Equipment> equipments;

    /**
     * Build a new Bike
     * @param Id the identifier of the bike
     */
    public Bike(String BikeId){
        this.BikeId = BikeId;
        this.nbUsage = 0;
        this.equipments = new ArrayList<Equipment>();
    }

    /**
     * Get the identifier of the bike
     * @return the identifier of the bike
     */
    public String getBikeId(){
        return this.BikeId;
    }
    
    /**
     * Get the amount of usage of the bike
     * @return the amount of usage of the bike
     */
    public int getNbUsage(){
        return this.nbUsage;
    }

    /**
     * Increment the amount of usage of the bike
     */
    public void incrementNbUsage(){
        this.nbUsage++;
    }

    /**
     * Decrement the amount of usage of the bike
     */
    public void decrementNbUsage(){
        this.nbUsage--;
    }

    /**
     * Two bikes are equal if they have the same identifier
     * @param obj the object to compare
     * @return true if the objects are equal
     */
    public boolean equals(Object obj){
        if (obj instanceof Bike){
            Bike Other = (Bike) obj;
            return this.getBikeId().equals(Other.getBikeId());
        }
        return false;
    }

    /**
     * Get a description of the bike
     * @return a description of the bike
     */
    public String toString(){
        return "Bike : " + this.getBikeId();
    }
}