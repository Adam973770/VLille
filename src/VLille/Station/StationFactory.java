package VLille.Station;

import java.util.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;
import VLille.Exceptions.*;
import VLille.controlCenter.*;

public interface StationFactory {

    Station createBikeStation(ControlCenter controlCenter);
}