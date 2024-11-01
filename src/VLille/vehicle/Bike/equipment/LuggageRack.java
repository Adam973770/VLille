package VLille.vehicle.Bike.equipment;
import VLille.vehicle.*;
import VLille.vehicle.Bike.*;

public class LuggageRack extends DecorateurBike {
    public LuggageRack (Bike b){
        bike = b;
    }

    public String getLibelle() {
        return bike.getLibelle() + "+ LuggageRack ";
    }
}