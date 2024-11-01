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

    private ControlCenter(){
        this.allStation = new ArrayList<Station>();
        this.allNotAvailableVehicles = new HashMap<User, Vehicle>();
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
}