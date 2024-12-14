package src.VLille.controlCenter;
import src.VLille.Station.*;
import java.util.*;
import src.VLille.vehicle.*;
import src.VLille.user.*;
/**
 * class for ControlCenter
 */
public class ControlCenter implements StationObserver{
    /** The unique instance of ControlCenter */
    private static ControlCenter uniqueInstance;
    /** The list of all the station being managed by the ControlCenter */
    private ArrayList<Station> allStation;
    /** Strategy use to distributed all the Vehicle in each station */
    private DistributionStrategy strategy; 

    /**
     * Constructs a new `ControlCenter` Object
     */
    private ControlCenter(){
        this.allStation = new ArrayList<Station>();
        this.strategy = new DistributionStrategylmpl();
    }

    /**
     * Returns the single instance of the ControlCenter class and creating it if it does not already exist
     * 
     * @return the unique instance of the ControlCenter class
     */
    public static ControlCenter getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ControlCenter();
        }
        return uniqueInstance;
    }

    /**
     * return the distribution strategy of the control center
     * 
     * @return The actual DistributionStrategy
     */
    public DistributionStrategy getStrategy(){
        return this.strategy;
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
     * Add a station to the control control
     * 
     * @param station the station added
     */
    public void addStation(Station station){
        this.allStation.add(station);
        station.addStationObserver(this);
        System.out.println(station.toString() + " a été ajouté au centre de controle");
    }

    /**
     * remove a station from the control control
     * 
     * @param station the station removed
     */
    public void removeStation(Station station){
        this.allStation.remove(station);
        station.removeStationObserver(this);
        System.out.println(station.toString() + " a été supprimé du centre de controle");
    }

    /**
     * Called when an event occurs at a station
     * 
     * @param station the station from where all the event occurs
     * @param event description of the event
     * @param vehicle the vehicle take or drop from the station
     */
    @Override
    public void update(Station station, String event, Vehicle vehicle){
        switch (event) {
            case "Vehicle has been take":
                System.out.println("ControlCenter : A vehicle has been taked in " + station.getId());
                break;
            case  "Vehicle has been drop":
                System.out.println("ControlCenter : A vehicle has been droped in " + station.getId());
                break;
        }
    }
}