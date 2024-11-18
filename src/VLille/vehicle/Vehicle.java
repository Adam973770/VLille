package VLille.vehicle;
import VLille.user.*;
import java.util.*;
/**
 * class for Vehicle
 */
public abstract class Vehicle {
    public static final int LIMIT_OF_USAGE = 5;
    protected String libelle;
    protected String vehicleId;
    protected int nbUsage; //nombre d'usage restant avant que le vehicule ne casse
    protected User currentRenter;
    protected String color;
    protected Random random;
    protected State state = new Available();

    /**
     * Contructs a new `Vehicle` Object
     */
    public Vehicle(){
        this.nbUsage = LIMIT_OF_USAGE;
        this.currentRenter = null;
        this.color= "red";
        this.random = new Random();
        this.vehicleId = "Vehicle " + random.nextInt(10000);
        this.state = new Available();
    }

    /**
     * change the state of the vehicle
     * 
     * @param state The state of the vehicle
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * return if the vehicle is available or not
     * 
     * @return the current state of the vehicle
     */
    public boolean vehicleAvailable(){
        return this.state.available();
    }

    /**
     * Return the libelle of the vehicle
     * 
     * @return The current libelle of the vehicle
     */
    public String getLibelle(){
        return this.libelle;
    }

    /**
     * Return the Id (identification) of the vehicle
     * 
     * @return The current id of the vehicle
     */
    public String getVehicleId(){
        return this.vehicleId;
    }

    /**
     * Return the number of time that a vehicle has been use 
     * 
     * @return The current number of time that the vehicle has been use
     */
    public int getNbUsage(){
        return this.nbUsage;
    }

    /**
     * Set the libelle of the vehicle
     * 
     * @param l The libelle of the vehicle
     */
    protected void setLibelle(String l){
        this.libelle = l;
    }

    /**
     * Set the Id (identification) of the vehicle
     * 
     * @param id The Id of the vehicle
     */
    protected void setVehicleId(String id){
        this.vehicleId = id;
    }

    /**
     * Set the number of usage of a vehicle
     * 
     * @param u The current number of usage of the vehicle
     */
    protected void setNbUsage(int u){
        this.nbUsage = u;
    }

    /**
     * return the description of a Vehicle Object
     */
    public String toString() { 
        return getLibelle() + "Id Bike : " + getVehicleId() + ", Nombre d'usage restant : " + getNbUsage(); 
    }
}                                                      