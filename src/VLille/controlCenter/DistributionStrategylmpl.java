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

public class DistributionStrategylmpl implements DistributionStrategy {
    /**
     * Construct a DistributionStrategylmpl Object
     */
    public DistributionStrategylmpl (){

    }

    @Override
    /**
     * Distribute all the vehicle in the system from all the station
     * 
     * @param stations the list of all the station in the system
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