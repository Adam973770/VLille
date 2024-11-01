package VLille.Station;

import java.util.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;
import VLille.Exceptions.*;
import VLille.controlCenter.*;

public class StationFactorylmpl implements StationFactory {

    @Override
    public Station createBikeStation(ControlCenter controlCenter){
        return new BikeStation(controlCenter);
    }
}