package VLille.vehicle;

/**
 * State of a vehicle which change depending on the context
 */
public abstract class State {

    protected Vehicle vehicle;
    protected String stateDescription;

    protected State(Vehicle vehicle){
        this.vehicle = vehicle;
        this.stateDescription = "";
    }

    public String getStateDescription(){
        this.stateDescription;
    }

    public void setStateDescription(String description){
        this.stateDescription = description;
    }

    public abstract void rented();
    public abstract void notRented();
    public abstract void stealed();
    public abstract void broken();
}