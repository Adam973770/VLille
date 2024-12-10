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
     * create a new state for the vehicle representing a rented state
     */
    public void rented(){
        setStateDescription("Rented");
        this.vehicle.setState(new RentedState(this.vehicle));
    }

    /**
     * create a new state for the vehicle representing a not rented state
     */
    public void notRented(){
        setStateDescription("Not rented");
        this.vehicle.setState(new NotRentedState(this.vehicle));
    }

    /**
     * create a new state for the vehicle representing a stealed state
     */
    public void stealed(){
        setStateDescription("Stealed");
        this.vehicle.setState(new StealedState(this.vehicle));
    }


    /**
     * create a new state for the vehicle representing a broken state
     */
    public void broken(){
        setStateDescription("Broken");
        this.vehicle.setState(new BrokenState(this.vehicle));
    }
}