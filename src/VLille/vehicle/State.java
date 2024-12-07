package src.VLille.vehicle;

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

    /**
     * set a new Vehicle Object to the state
     * 
     * @param v the new Vehicle
     */
    public void setVehicle(Vehicle v){
        this.vehicle = v;
    }

    /**
     * Represent the state of a vehicle depending on the context, here the vehicle is rented
     */
    public abstract void rented();

    /**
     * Represent the state of a vehicle depending on the context, here the vehicle is not rented
     */
    public abstract void notRented();

    /**
     * Represent the state of a vehicle depending on the context, here the vehicle is stealed by a thief
     */
    public abstract void stealed();

    /**
     * Represent the state of a vehicle depending on the context, here the vehicle is broken and need to be repair
     */
    public abstract void broken();
}