package src.VLille.user;
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
 * Implementation of the ActionUser interface, providing concrete operations for user actions like renting, dropping off, repairing, painting, and stealing vehicles
 */
public class ActionUserlmpl implements ActionUser{

    /**
     * Default constructor for the ActionUserImpl class.
     */
    public ActionUserlmpl(){

    }
    
    /**
     * Allows a user to rent a vehicle from a station
     * 
     * @param user The user renting the vehicle
     * @param station The station from where the vehicle come from
     * @throws StationIsAlreadyEmpty if the station has no vehicle to rent
     */
    public void rent(User user, Station station) throws StationIsAlreadyEmpty {
        try {
            user.ownedVehicle = station.takeVehicle();
            user.ownedVehicle.setCurrentRenter(user);
            user.ownedVehicle.setIntervaleBeforeSteal(2);
        }
        catch (Exception e) {
            System.out.println("No vehicle available in this station");
        }
    }

    /**
     * Allows a user to drop a vehicle in a station
     * @param user The user dropping the vehicle
     * @param station The station from where the vehicle is gonna be drop
     * @throws StationIsFullException if the station has no slot to drop the vehicle
     */
    public void drop(User user, Station station) throws StationIsFullException{
        try{
            station.dropVehicle(user.getOwnedVehicle());
            user.ownedVehicle.setCurrentRenter(null);
            user.ownedVehicle = null;
        }
        catch (Exception e) {
            System.out.println("No place to drop this vehicle");
        }
    }

    /**
     * Repairs a vehicle to restore it to working condition.
     * 
     * @param repairer The repairer responsible for fixing the vehicle.
     * @param vehicle The vehicle to be repaired.
     */
    public void repair(Repairer repairer, Vehicle vehicle){
        if (vehicle.getState() == "Broken"){
            vehicle.setState(new NotRentedState(vehicle));
            vehicle.setNbUsage(5);
        }
    }

    /**
     * Changes the color of a vehicle.
     * 
     * @param painter The painter responsible for applying the new color.
     * @param vehicle The vehicle to be painted.
     * @param color The new color to apply to the vehicle.
     */
    public void paint(Painter painter, Vehicle vehicle, String color){
        vehicle.setColor(color);
    }

    /**
     * Simulates the theft of a vehicle.
     * 
     * @param thief The thief attempting to steal the vehicle.
     * @param stations The station where the vehicle are.
     */
    public void steal(Thief thief, List<Station> stations){
        for (Station station : stations){
            for (int i = 0; i < station.getCapacity(); i++){
                Vehicle vehicle = station.getAllVehicle().get(i);
                if (vehicle != null && vehicle.getIntervaleBeforeSteal() == 0 && vehicle.getRandom().nextInt(10) <= 5){
                    vehicle.stealed();
                    thief.getVehiclesteal().add(vehicle);
                    station.getAllVehicle().set(i, null);
                }
            }
        }
    }
}