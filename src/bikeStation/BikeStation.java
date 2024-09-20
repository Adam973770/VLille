package bikeStation;
import java.util.Random;
import Bike.Bike;

public class BikeStation{
    
    private Bike bikes [];
    private int nbOfBikes;
    private String bikeStationId;
    private int cmpTimer; /*compte le nombre de fois qu'une sation est vide ou plein apres chaus e fin de timer*/
    private static Random random = new Random();

    public BikeStation (String id) {
        this.bikes = Bike [this.capacity];
        this.bikeStationId =id;
        this.capacity = generateCapacity();
        this.cmpTimer = 0;
        this.nbOfBikes = 0;

        /*initialise toute les valeurs du tableau a null */
        for (int i=0; i<this.capacity; i++){
            this.bikes[i] = null;
        }
    }

    /*Genere la capacité de la station aléatoirement entre 10 et 20*/
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

    /*renvoie le nombre de bike present dans la station */
    public int getNbOfBike(){
        return this.nbOfBikes;
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

    /*Permet de deposer un velo dans le premier emplacement vide de la station */
    public void dropBike(Bike bike) {
        
    }
}