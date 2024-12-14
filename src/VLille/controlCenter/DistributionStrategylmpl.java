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
 * Implementation of the DistributionStrategy interface
 * This class provides a specific strategy for distributing vehicles across stations
 */
public class DistributionStrategylmpl implements DistributionStrategy {
    /**
     * Construct a DistributionStrategylmpl Object
     */
    public DistributionStrategylmpl (){

    }

    @Override
    /**
     * Distribute all the vehicle in the system from all the station in each station, this method collects all vehicles from the given list of stations and redistributes them 
     * one by one, station by station, in a round-robin manne
     * 
     * @param stations the list of all the station in the system
     * @throws StationIsAlreadyEmpty if a station is already empty and no vehicles can be taked from it
     * @throws StationIsFullException if a station is full and cannot dropped more vehicles
     */
    public void distribution(List<Station> stations) throws StationIsAlreadyEmpty, StationIsFullException{
        int nbStations = stations.size();
        int currentStation = 0;
        List<Vehicle> allVehicle = new ArrayList<>();
        if (stations.isEmpty()){
            return;
        }
        for (Station station : stations){
            try{
                allVehicle.addAll(station.takeAllVehicle());
            }catch(StationIsAlreadyEmpty e) {
                //Silent the exception
            }
        }
        while(!(allVehicle.size() == 0)){
            try{
                stations.get(currentStation).dropVehicle(allVehicle.get(0));
                allVehicle.remove(0);
            }catch (StationIsFullException e){
                //Silent the exception
            }
            currentStation = (currentStation + 1) % nbStations;
        }
    }
}