package VLille.controlCenter;
import VLille.Station.*;
import java.util.*;
import VLille.vehicle.*;
import VLille.user.*;
/**
 * class for ControlCenter
 */
public class ControlCenter{

    private static ControlCenter uniqueInstance;

    private ArrayList<Station> allStation;
    private Map<User, Vehicle> allNotAvailableVehicles;
    private ArrayList<ControlCenterObserver> observers; 

    private ControlCenter(){
        this.allStation = new ArrayList<Station>();
        this.allNotAvailableVehicles = new HashMap<User, Vehicle>();
        this.observers = new ArrayList<>();
    }

    public static ControlCenter getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ControlCenter();
        }
        return uniqueInstance;
    }

    public ArrayList<Station> getAllBikeStation(){
        return this.allStation;
    }

    public Map<User, Vehicle> getAllNotAvailableVehicles(){
        return this.allNotAvailableVehicles;
    }

    public void addObserver(ControlCenterObserver observer){
        this.observers.add(observer);
    }

    public void removeObserver(ControlCenterObserver observer){
        this.observers.remove(observer);
    }

    public void notificationObserver(String message) {
        for (ControlCenterObserver observer : observers) {
            observer.update(message);
        }
    }

    public void addStation(Station station){
        this.allStation.add(station);
        notificationObserver(station.toString() + " a été ajouté au centre de controle");
    }

    public void removeStation(Station station){
        this.allStation.remove(station);
        notificationObserver(station.toString() + " a été supprimé du centre de controle");
    }

    public void addNotAvailableVehicle(User user, Vehicle vehicle) {
        this.allNotAvailableVehicles.put(user, vehicle);
        notificationObserver(vehicle.toString() + " n'est pas disponible");
    }

}