package VLille.Station;

import java.util.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;
import VLille.Exceptions.*;
import VLille.controlCenter.*;

public abstract class Station implements ControlCenterObserver{

    protected ArrayList<Vehicle> allVehicle;
    protected int capacity;
    protected ControlCenter controlCenter;
    protected String id;
    protected Random random;

    /**
     * Constructs a new `Station` Object
     * 
     * @param controlCenter The `controlCenter` object in charge of the station
     */
    public Station(ControlCenter controlCenter){
        this.allVehicle = new ArrayList<Vehicle>();
        this.capacity = random.nextInt(10) + 10;
        this.controlCenter = controlCenter;
        this.id = "Station " + random.nextInt(10000);
        this.random = new Random();

        for (int i = 0; i < this.capacity; i++) {
            this.allVehicle.add(null);
        }
    }

    /**
     * Return the list of all the vehicle in the station
     * 
     * @return The current list of the vehicle in the station
     */
    public List<Vehicle> getAllVehicle() {
        return this.allVehicle;
    }

    /**
     * Return the capacity of the station
     * 
     * @return The capacity of the station
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Return the control center in charge of the station
     * 
     * @return The current ControlCenter in charge of the station
     */
    public ControlCenter getControlCenter() {
        return this.controlCenter;
    }

    /**
     * Return the Id (identification) of the station that is unique for each station Object
     * 
     * @return The current Id of the station
     */
    public String getId() {
        return this.id;
    }

    /**
     * Return the object random use to create a random Id
     * 
     * @return The current random
     */
    public Random getRandom() {
        return this.random;
    } 

    /**
     * Specify if the station is empty or not
     * 
     * @return true if the station is empty else false if the station has at least one vehicle 
     */
    public boolean isEmpty(){
        for (Vehicle vehicle : allVehicle){
            if (vehicle != null){
                return false;
            }
        }
        return true;
    }

    /**
     * Specify if the station is full or not
     * 
     * @return false if the station is not full else true
     */
    public boolean isFull(){;
        for (Vehicle vehicle : allVehicle){
            if (vehicle == null){
                return false;
            }
        }
        return true;
    }

    /**
     * Drop a `Vehicle` Object in the station if the station is not full
     * 
     * @param v The vehicle that i want to drop in the station
     * @throws StationIsFullException if the station is already full before droping the Vehicle
     */
    public void dropVehicle(Vehicle v) throws StationIsFullException {
        if (isFull()){
            throw new StationIsFullException("Station is full, cannot drop a vehicle");
        }
        for (int i = 0; i<this.capacity; i++){
            if (this.allVehicle.get(i)==null){
                this.allVehicle.add(v);
            }
        }
    }

    /**
     * Take the first `Vehicle` Object in the station 
     * 
     * @throws StationIsAlreadyEmpty if the station is already empty
     * @return The `Vehicle` Object that has been take in the station
     */
    public Vehicle takeVehicle() throws StationIsAlreadyEmpty {
        if (isEmpty()){
            throw new StationIsAlreadyEmpty("Station is already empty");
        }
        for (int i = 0; i < this.capacity; i++){
            if (this.allVehicle.get(i) != null){
                Vehicle vehicle = this.allVehicle.get(i);
                this.allVehicle.set(i, null);
                return vehicle;
            }
        }
        return null;
    }

    /**
     * empty the station of all the `Vehicle` object
     * 
     * @throws StationIsAlreadyEmpty if the station is already empty
     * @return The list of all the vehicle that was in the station
     */
    public List<Vehicle> takeAllVehicle() throws StationIsAlreadyEmpty {
        if (isFull()){
            throw new StationIsAlreadyEmpty("Station is already empty");
        }
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for (int i = 0; i < this.capacity; i++){
            if (this.allVehicle.get(i) != null){
                Vehicle vehicle = this.allVehicle.get(i);
                vehicles.add(vehicle);
                this.allVehicle.set(i, null);
            }
        }
        return vehicles;
    }

    public void update(String message) {
        System.out.println("Station " + this.id + " a reçu la notification : " + message);
    }

    public String toString() {
        return "Station : " + getId();
    }
}