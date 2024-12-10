package src.VLille.vehicle;

/**
 * State of a vehicle which represent the context not rented
 */
public class NotRentedState extends State {

    /**
     * Construct a new `NotRentedState` Object
     * 
     * @param vehicle the object that gonna have this state
     */
    public NotRentedState(Vehicle vehicle){
        super(vehicle);
        this.stateDescription = "Not rented";
    }
}