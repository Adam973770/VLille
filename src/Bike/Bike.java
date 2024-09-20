package Bike;
public class Bike{

    public static final Int NB_USAGE = 5;

    protected String idBike;
    protected Bool basket;
    protected Bool luggageRack;
    protected int nbUsage;

    public Bike(String idBike, Bool basket, Bool luggageRack){
        this.idBike = idBike;
        this.basket = basket;
        this.luggageRack = luggageRack;
        this.nbUsage = NB_USAGE;
    }

    public String getId(){
        return this.idBike;
    }
    public Bool getBasket(){
        return this.basket;
    }
    public Bool getLuggageRack(){
        return this.luggageRack;
    }
    public Int getNbUsage(){
        return this.nbUsage;
    }


}