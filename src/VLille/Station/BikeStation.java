package VLille.Station;

import java.util.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;
import VLille.Exceptions.*;
import VLille.controlCenter.*;

public class BikeStation extends Station {

    public BikeStation(ControlCenter controlCenter) {
        super(controlCenter);
    }

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