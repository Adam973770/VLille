package VLille.Station;

import java.util.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;
import VLille.Exceptions.*;
import VLille.controlCenter.*;

public class BikeStation extends Station {
    /**
     * Constructs a new `BikeStation` Object 
     * 
     * @param controlCenter The `controlCenter` object in charge of the station
     */
    public BikeStation(ControlCenter controlCenter) {
        super(controlCenter);
    }

    /**
     * Drop a `Bike` Object in the station if the station is not full
     * 
     * @param bike The bike that i want to drop in the station
     * @throws StationIsFullException if the station is already full before droping the Vehicle
     */
    public void dropVehicle(Bike bike) throws StationIsFullException {
        if (isFull()) {
            throw new StationIsFullException("Station is full, cannot drop a bike");
        }
        for (int i = 0; i < this.capacity; i++) {
            if (this.allVehicle.get(i) == null) {
                this.allVehicle.set(i, bike); 
                return;
            }
        }
    }

    /**
     * Take the first `Bike` Object in the station 
     * 
     * @throws StationIsAlreadyEmpty if the station is already empty
     * @return The `Bike` Object that has been take in the station
     */
    public Bike takeVehicle() throws StationIsAlreadyEmpty {
        if (isEmpty()) {
            throw new StationIsAlreadyEmpty("Station is already empty");
        }
        for (int i = 0; i < this.capacity; i++) {
            if (this.allVehicle.get(i) != null) {
                Bike bike = (Bike) this.allVehicle.get(i); 
                this.allVehicle.set(i, null); 
                return bike;
            }
        }
        return null;
    }

    /**
     * empty the station of all the `Bike` object
     * 
     * @throws StationIsAlreadyEmpty if the station is already empty
     * @return The list of all the bike that was in the station
     */
    public List<Bike> takeAllBikes() throws StationIsAlreadyEmpty {
        if (isEmpty()) {
            throw new StationIsAlreadyEmpty("Station is already empty");
        }
        List<Bike> bikes = new ArrayList<>(); 
        for (int i = 0; i < this.capacity; i++) {
            if (this.allVehicle.get(i) != null) {
                Bike bike = (Bike) this.allVehicle.get(i); 
                bikes.add(bike); 
                this.allVehicle.set(i, null); 
            }
        }
        return bikes;
    }


    @Override
    public String toString() {
        return "BikeStation : " + getId();
    }
}