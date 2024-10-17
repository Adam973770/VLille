package VLille.vehicle;
public abstract class Vehicle {
    protected String libelle;
    protected String vehicleId;
    protected int nbUsage;

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
        return getLibelle() + "Id Vehicle : " + getVehicleId() + ", Nombre d'usage : " + getNbUsage(); 
    }
}