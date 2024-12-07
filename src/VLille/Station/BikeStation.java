package src.VLille.Station;

import java.util.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.vehicle.*;
import src.VLille.Exceptions.*;
import src.VLille.controlCenter.*;

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