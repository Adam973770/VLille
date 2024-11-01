package VLille.vehicle;
import VLille.user.*;
import java.util.*;
public abstract class Vehicle {
    public static final int LIMIT_OF_USAGE = 5;
    protected String libelle;
    protected String vehicleId;
    protected int nbUsage; //nombre d'usage restant avant que le vehicule ne casse
    protected User currentRenter;
    protected String color;
    protected Random random;

    public Vehicle(){
        this.nbUsage = LIMIT_OF_USAGE;
        this.currentRenter = null;
        this.color= "red";
        this.random = new Random();
        this.vehicleId = "Vehicle " + random.nextInt(10000);
    }

    public String getLibelle(){
        return this.libelle;
    }

    public String getVehicleId(){
        return this.vehicleId;
    }

    public int getNbUsage(){
        return this.nbUsage;
    }

    protected void setLibelle(String l){
        this.libelle = l;
    }

    protected void setVehicleId(String id){
        this.vehicleId = id;
    }

    protected void setNbUsage(int u){
        this.nbUsage = u;
    }

    public String toString() { 
        return getLibelle() + "Id Vehicle : " + getVehicleId() + ", Nombre d'usage restant : " + getNbUsage(); 
    }
}