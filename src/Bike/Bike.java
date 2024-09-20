package Bike;
/**
 * class for a Bike 
 */
public class Bike {

    /** maximum limit of usage of a bike */
    public static final int LIMIT_OF_USAGE = 5;

    /** the Identifier of the bike */
    protected String Id;

    /** amount of usage of the bike */
    protected int nbUsage;

    /**
     * Build a new Bike
     * @param Id the identifier of the bike
     */
    public Bike(String Id){
        this.Id = Id;
        this.nbUsage = 0;
    }

    /**
     * Get the identifier of the bike
     * @return the identifier of the bike
     */
    public String getId(){
        return this.Id;
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
            return this.getId().equals(Other.getId());
        }
        return false;
    }

    /**
     * Get a description of the bike
     * @return a description of the bike
     */
    public String toString(){
        return "Bike : " + this.getId();
    }
}