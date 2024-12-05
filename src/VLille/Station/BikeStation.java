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
    * Returns a string representation of the station, including its ID.
    * 
    * @return The identifier of the station.
    */
    @Override
    public String toString() {
        return "BikeStation : " + getId();
    }
}