package bikeStation;
import java.util.Random;
import Bike.Bike;

public class BikeStation{
    
    private Bike bikes [];
    private String bikeStationId;
    private int cmpTimer; /*compte le nombre de fois qu'une sation est vide ou plein apres chaus e fin de timer*/
    private static Random random = new Random();

    public BikeStation (String id) {
        this.bikes = Bike [this.capacity];
        this.bikeStationId =id;
        this.capacity = generateCapacity();
        this.cmpTimer = 0;

        for (int i=0; i<this.capacity; i++){
            this.bikes[i] = null;
        }
    }

    public int generateCapacity(){
        return 10 + BikeStation.random.nextInt(10);
    }

    /*Renvoie la liste de tout les emplacements de la sation*/ 
    public Bike[] getBikes(){
        return this.bikes;
    }

    public String getBikeStationId(){
        return this.bikeStationId;
    }

    public int getCmpTimer(){
        return this.cmpTimer;
    }

    public int getCapacity(){
        return this.capacity;
    }

    /*Renvoie le numero du premiere emplacement vide */
    public int firstFreeSlot(){
        for (int i = 0; i<this.capacity; i++){
            if (this.bikes[i] == null){
                return i;
            }
            else {
                return -1;
                System.out.println("Il n'y a pas d'emplacement vide");
            }
        }
    }
}