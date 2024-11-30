package VLille;
import VLille.*;
import VLille.Station.*;
import java.util.*;
import VLille.vehicle.*;
import VLille.user.*;
import VLille.controlCenter.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.Bike.equipment.*;
import VLille.Exceptions.*;

public class Main {
    public static void main(String [] args) throws StationIsAlreadyEmpty, StationIsFullException{
        //user
        Painter painter = new Painter.PainterBuilder().setFirstName("Jeanne").setGender("Femme").build();
        Renter renter = new Renter.RenterBuilder().setFirstName("Theo").setGender("Homme").build();
        Repairer repairer = new Repairer.RepairerBuilder().setFirstName("Theophane").setGender("Homme").build();
        Thief thief = new Thief.ThiefBuilder().setFirstName("Leo").setGender("Homme").build();

        //vehicle
        Bike b1 = new ClassicBike();
        b1 = new Basket(b1);
        b1 = new Bottle(b1);

        Bike b2 = new ElectricBike();
        b2 = new Basket(b2);
        b2 = new LuggageRack(b2);

        //station
        ControlCenter controlCenter = ControlCenter.getInstance();
        Station bikeStation = new Station(controlCenter);
        bikeStation.dropVehicle(b1);

        //action User
        ActionUserlmpl actionUser = new ActionUserlmpl();
        actionUser.rent(repairer, bikeStation);
        System.out.println(repairer.getOwnedVehicle());
        System.out.println(b1.getCurrentRenter());
        actionUser.drop(repairer, bikeStation);
        System.out.println(repairer.getOwnedVehicle());
        System.out.println(b1.getCurrentRenter());
        System.out.println(b1.toString());

    }
}