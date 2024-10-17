package VLille.vehicle.Bike;
public abstract class Bike {
    protected String libelle;
    protected String bikeId;
    protected int nbUsage;

    public String getLibelle(){
        return this.libelle;
    }

    public String getBikeId(){
        return this.bikeId;
    }

    public int getNbUsage(){
        return this.nbUsage;
    }

    protected void setLibelle(String l){
        this.libelle = l;
    }

    protected void setBikeId(String id){
        this.bikeId = id;
    }

    protected void setNbUsage(int u){
        this.nbUsage = u;
    }

    public String toString() { 
        return getLibelle() + "Id Bike : " + getBikeId() + ", Nombre d'usage : " + getNbUsage(); 
    }
}