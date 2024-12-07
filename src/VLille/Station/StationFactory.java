package src.VLille.Station;

import java.util.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.vehicle.*;
import src.VLille.Exceptions.*;
import src.VLille.controlCenter.*;

public interface StationFactory {

    Station createBikeStation(ControlCenter controlCenter);
}