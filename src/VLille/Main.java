package VLille;
import VLille.*;
import VLille.Station.*;
import java.util.*;
import VLille.vehicle.*;
import VLille.user.*;
import VLille.controlCenter.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.Bike.equipment.*;

public class Main {
    public static void main(String [] args){
        //user
        Painter painter = new Painter.PainterBuilder().setFirstName("Jeanne").setGender("Femme").build();
        System.out.println(painter.getFirstName());
        Renter renter = new Renter.RenterBuilder().setFirstName("Theo").setGender("Homme").build();
        System.out.println(renter.getFirstName());
        Repairer repairer = new Repairer.RepairerBuilder().setFirstName("Theophane").setGender("Homme").build();
        System.out.println(repairer.getFirstName());
        //vehicle
        Bike b1 = new ClassicBike();
        b1 = new Basket(b1);
        b1 = new Bottle(b1);
        System.out.println(b1.toString());

        Bike b2 = new ElectricBike();
        b2 = new Basket(b2);
        b2 = new LuggageRack(b2);
        System.out.println(b2.toString());
        b2.rented();
        System.out.println(b2.toString());
    }
}