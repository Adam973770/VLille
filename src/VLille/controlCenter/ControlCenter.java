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

    private ArrayList<Station> allStation;
    private DistributionStrategy strategy; 

    /**
     * Constructs a new `ControlCenter` Object
     */
    private ControlCenter(){
        this.allStation = new ArrayList<Station>();
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
     * This method is use to know which event has been create
     * 
     * @param station the station from all the event react
     * @param event the event created
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