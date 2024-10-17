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

    public int getNbUsage(){
        return bike.getNbUsage();
    }

    public String getBikeId(){
        return bike.getBikeId();
    }
}