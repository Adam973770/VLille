package VLille.Station;

import java.util.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;
import VLille.Exceptions.*;
import VLille.controlCenter.*;

public abstract class Station {

    protected List<Vehicle> allVehicle;
    protected int capacity;
    protected ControlCenter controlCenter;
    protected String id;
    protected Random random;

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

    public List<Vehicle> getAllVehicle() {
        return this.allVehicle;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ControlCenter getControlCenter() {
        return this.controlCenter;
    }

    public String getId() {
        return this.id;
    }

    public Random getRandom() {
        return this.random;
    } 

    public boolean isEmpty(){
        for (Vehicle vehicle : allVehicle){
            if (vehicle != null){
                return false;
            }
        }
        return true;
    }

    public boolean isFull(){
        int stock=0;
        for (Vehicle vehicle : allVehicle){
            if (vehicle == null){
                return false;
            }
        }
        return true;
    }

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

    public String toString() {
        return "Station : " + getId();
    }
}