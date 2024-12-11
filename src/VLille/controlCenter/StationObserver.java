package src.VLille.controlCenter;
import src.VLille.Station.*;
import java.util.*;
import src.VLille.vehicle.*;
import src.VLille.user.*;

public interface StationObserver {
    public void update(Station station, String event, Vehicle vehicle);
}