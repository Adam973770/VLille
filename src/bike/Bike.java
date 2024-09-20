package bike;
public class Bike{

    public static final int NB_USAGE = 5;

    protected String idBike;
    protected boolean basket;
    protected boolean luggageRack;
    protected int nbUsage;

    public Bike(String idBike, boolean basket, boolean luggageRack){
        this.idBike = idBike;
        this.basket = basket;
        this.luggageRack = luggageRack;
        this.nbUsage = NB_USAGE;
    }

    public String getId(){
        return this.idBike;
    }
    public boolean getBasket(){
        return this.basket;
    }
    public boolean getLuggageRack(){
        return this.luggageRack;
    }
    public int getNbUsage(){
        return this.nbUsage;
    }

}