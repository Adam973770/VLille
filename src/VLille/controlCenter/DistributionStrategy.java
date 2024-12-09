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
     * Distribute all the vehicle in the system from all the station
     * 
     * @param stations the list of all the station in the system
     */
    public void distribution(List<Station> stations) throws StationIsAlreadyEmpty, StationIsFullException;
} 