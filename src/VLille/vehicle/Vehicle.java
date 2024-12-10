package src.VLille.vehicle;
import src.VLille.user.*;
import java.util.*;
/**
 * Class for Vehicle
 */
public abstract class Vehicle {
    public static final int LIMIT_OF_USAGE = 5;
    protected String libelle;
    protected String vehicleId;
    protected int nbUsage; //nombre d'usage restant avant que le vehicule ne casse
    protected User currentRenter;
    protected String color;
    protected Random random;
    protected State state;
    protected int intervaleBeforeSteal;

    /**
     * Contructs a new `Vehicle` Object
     */
    public Vehicle(){
        this.nbUsage = LIMIT_OF_USAGE;
        this.currentRenter = null;
        this.color= "red";
        this.random = new Random();
        this.vehicleId = "Vehicle " + random.nextInt(10000);
        this.state = new NotRentedState(this);
        this.intervaleBeforeSteal = 2;
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
     * Return the current renter of the vehicle 
     * 
     * @return The current renter of the vehicle 
     */
    public User getCurrentRenter(){
        return this.currentRenter;
    }

    /**
     * Return the color of the vehicle 
     * 
     * @return The current color of the vehicle
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Return the attribute random of the vehicle 
     * 
     * @return The current attribute random of the vehicle
     */
    public Random getRandom(){
        return this.random;
    }

    /**
     * return the description of the vehicle state
     * 
     * @return the actual state description of the vehicle
     */
    public String getState(){
        return this.state.getStateDescription();
    }

    /**
     * Return the intervale remaining before a vehicle can be steal
     * 
     * @return the intervale remaining before a vehicle can be steal
     */
    public int getIntervaleBeforeSteal(){
        return this.intervaleBeforeSteal;
    }

    /**
     * Set the libelle of the vehicle
     * 
     * @param l The libelle of the vehicle
     */
    public void setLibelle(String l){
        this.libelle = l;
    }

    /**
     * Set the Id (identification) of the vehicle
     * 
     * @param id The Id of the vehicle
     */
    public void setVehicleId(String id){
        this.vehicleId = id;
    }

    /**
     * Set the number of usage of a vehicle
     * 
     * @param u The current number of usage of the vehicle
     */
    public void setNbUsage(int u){
        this.nbUsage = u;
        if(u <= 0){
            this.state = new BrokenState(this);
        }
    }

    /**
     * Set the owner of a vehicle
     * 
     * @param user The current owner of the vehicle
     */
    public void setCurrentRenter(User user){
        this.currentRenter = user;
    }

    /**
     * Set the color of a vehicle
     * 
     * @param color The current color of the vehicle
     */
    public void setColor (String color){
        this.color = color;
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
     * change the interval remaining before a vehicle can be steal
     * 
     * @param state the new interval
     */
    public void setIntervaleBeforeSteal(int inter){
        this.intervaleBeforeSteal = inter;
    }

    /**
     * change the state of the bike to Rented
     */
    public void rented(){
        state.rented();
    }

    /**
     * change the state of the bike to Not rented
     */
    public void notRented(){    
        state.notRented();
    }

    /**
     * change the state of the bike to Stealed
     */
    public void stealed(){
        state.stealed();
    }

    /**
     * change the state of the bike to Broken
     */
    public void broken(){
        state.broken();
    }

    /**
     * return the description of a Vehicle Object
     */
    public String toString() { 
        return getLibelle() + " | Id Bike : " + getVehicleId() + " | Nombre d'usage restant : " + getNbUsage() + " | State : " + this.state.getStateDescription(); 
    }
}                                                      