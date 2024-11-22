package VLille.vehicle;

/**
 * State of a vehicle which change depending on the context
 */
public abstract class State {

    protected Vehicle vehicle;
    protected String stateDescription;

    /**
     * Construct a new `State` Object
     * 
     * @param vehicle the object that gonna have this state
     */
    protected State(Vehicle vehicle){
        this.vehicle = vehicle;
        this.stateDescription = "State";
    }

    /**
     * get the description of the actual state
     * 
     * @return the description of the actual state
     */
    public String getStateDescription(){
        return this.stateDescription;
    }

    /**
     * set a new description for the actual state
     * 
     * @param description the new description for the actual state
     */
    public void setStateDescription(String description){
        this.stateDescription = description;
    }

    public abstract void rented();
    public abstract void notRented();
    public abstract void stealed();
    public abstract void broken();
}