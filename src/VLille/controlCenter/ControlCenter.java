package src.VLille.controlCenter;
import src.VLille.Station.*;
import java.util.*;
import src.VLille.vehicle.*;
import src.VLille.user.*;
/**
 * class for ControlCenter
 */
public class ControlCenter{
    /** The unique instance of ControlCenter */
    private static ControlCenter uniqueInstance;

    private ArrayList<Station> allStation;
    private Map<User, Vehicle> allNotAvailableVehicles;
    private ArrayList<ControlCenterObserver> observers;
    private DistributionStrategy strategy; 

    /**
     * Constructs a new `ControlCenter` Object
     */
    private ControlCenter(){
        this.allStation = new ArrayList<Station>();
        this.allNotAvailableVehicles = new HashMap<User, Vehicle>();
        this.observers = new ArrayList<>();
        this.strategy = new DistributionStrategylmpl();
    }

    public static ControlCenter getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ControlCenter();
        }
        return uniqueInstance;
    }

    /**
     * Changes the distribution strategy
     * 
     * @param strat the new DistributionStrategy
     */
    public void setStrategy(DistributionStrategy strat){
        this.strategy = strat;
    }

    /**
     * Return the list of all station manage by the control center
     * 
     * @return The current list of the station managed by the control center
     */
    public ArrayList<Station> getAllBikeStation(){
        return this.allStation;
    }

    /**
     * Return the hashmap of all the vehicle not available 
     * 
     * @return The current hashmap of all the vehicle not available 
     */
    public Map<User, Vehicle> getAllNotAvailableVehicles(){
        return this.allNotAvailableVehicles;
    }

    /**
     * Add an observer to the control centers
     * 
     * @param observer the observer added
     */
    public void addObserver(ControlCenterObserver observer){
        this.observers.add(observer);
    }

    /**
     * Remove an obeserver from the control center
     * 
     * @param observer the observer removed
     */
    public void removeObserver(ControlCenterObserver observer){
        this.observers.remove(observer);
    }

    /**
     * Send a message to the control center from the observer
     * 
     * @param message the message send to the control center
     */
    public void notificationObserver(String message) {
        for (ControlCenterObserver observer : observers) {
            observer.update(message);
        }
    }

    /**
     * Add a station to the control control
     * 
     * @param station the station added
     */
    public void addStation(Station station){
        this.allStation.add(station);
        notificationObserver(station.toString() + " a été ajouté au centre de controle");
    }

    /**
     * remove a station from the control control
     * 
     * @param station the station removed
     */
    public void removeStation(Station station){
        this.allStation.remove(station);
        notificationObserver(station.toString() + " a été supprimé du centre de controle");
    }

    /**
     * Identifies if a vehicle is available or not and add him in the hashmap
     * 
     * @param user,vehicle the user of the vehicle and the vehicle
     */
    public void addNotAvailableVehicle(User user, Vehicle vehicle) {
        this.allNotAvailableVehicles.put(user, vehicle);
        notificationObserver(vehicle.toString() + " n'est pas disponible");
    }

}