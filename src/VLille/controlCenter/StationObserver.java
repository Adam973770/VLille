package src.VLille.controlCenter;
import src.VLille.Station.*;
import java.util.*;
import src.VLille.vehicle.*;
import src.VLille.user.*;

/**
 * Interface representing an observer in the observer design pattern
 */
public interface StationObserver {

    /**
     * Called when an event occurs at a station
     * 
     * @param station the station from where all the event occurs
     * @param event description of the event
     * @param vehicle the vehicle take or drop from the station
     */    
    public void update(Station station, String event, Vehicle vehicle);
}