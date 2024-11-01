package VLille.vehicle;
import VLille.vehicle.*;
import VLille.vehicle.Bike.*;
import VLille.vehicle.Bike.equipment.*;

public class MainVehicle {
    public static void main (String[] args){
        Bike b1 = new ClassicBike();
        b1 = new Basket(b1);
        b1 = new Bottle(b1);
        System.out.println(b1);

        Bike b2 = new ElectricBike();
        b2 = new Basket(b2);
        b2 = new LuggageRack(b2);
        System.out.println(b2);

    }
}