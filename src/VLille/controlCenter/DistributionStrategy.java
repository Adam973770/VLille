package src.VLille.controlCenter;

import src.VLille.*;
import src.VLille.Station.*;
import java.util.*;
import src.VLille.vehicle.*;
import src.VLille.user.*;
import src.VLille.controlCenter.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.vehicle.Bike.equipment.*;
import src.VLille.Exceptions.*;

/**
 * DistributionStrategy define how the Vehicle Object gonna be distributed in the station of the system
 */
public interface DistributionStrategy {
    /**
     * Distribute all the vehicle in the system from all the station in each station
     * 
     * @param stations the list of all the station in the system
     * @throws StationIsAlreadyEmpty if a station is already empty and no vehicles can be taked from it
     * @throws StationIsFullException if a station is full and cannot dropped more vehicles
     */
    public void distribution(List<Station> stations) throws StationIsAlreadyEmpty, StationIsFullException;
} 