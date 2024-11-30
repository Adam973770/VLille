package VLille.user;
import VLille.*;
import VLille.Station.*;
import java.util.*;
import VLille.vehicle.*;
import VLille.user.*;
import VLille.controlCenter.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.Bike.equipment.*;
import VLille.Exceptions.*;

/**
 * Interface representing the actions that a user can perform within the VLille system.
 * Includes operations for renting, dropping off, repairing, painting, and stealing vehicles.
 */
public interface ActionUser {

    /**
     * Allows a user to rent a vehicle from a station
     * 
     * @param user The user renting the vehicle
     * @param station The station from where the vehicle come from
     * @throws StationIsAlreadyEmpty if the station has no vehicle to rent
     */
    public void rent(User user, Station station) throws StationIsAlreadyEmpty;

    /**
     * Allows a user to drop a vehicle in a station
     * @param user The user dropping the vehicle
     * @param station The station from where the vehicle is gonna be drop
     * @throws StationIsFullException if the station has no slot to drop the vehicle
     */
    public void drop(User user, Station station) throws StationIsFullException;

    /**
     * Repairs a vehicle to restore it to working condition.
     * 
     * @param repairer The repairer responsible for fixing the vehicle.
     * @param vehicle The vehicle to be repaired.
     */
    public void repair(Repairer repairer, Vehicle vehicle);

    /**
     * Changes the color of a vehicle.
     * 
     * @param painter The painter responsible for applying the new color.
     * @param vehicle The vehicle to be painted.
     * @param color The new color to apply to the vehicle.
     */
    public void paint(Painter painter, Vehicle vehicle, String color);

    /**
     * Simulates the theft of a vehicle.
     * 
     * @param thief The thief attempting to steal the vehicle.
     * @param vehicle The vehicle to be stolen.
     */
    public void steal(Thief thief, Vehicle vehicle);
}