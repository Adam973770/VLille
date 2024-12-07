package src.VLille.Station;

import java.util.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.vehicle.*;
import src.VLille.Exceptions.*;
import src.VLille.controlCenter.*;

public class StationFactorylmpl implements StationFactory {

    @Override
    public Station createBikeStation(ControlCenter controlCenter){
        return new BikeStation(controlCenter);
    }
}