package src.VLille.vehicle;

/**
 * State of a vehicle which represent the context not rented
 */
public class RentedState extends State{
    /**
     * Construct a new `RentedState` Object
     * 
     * @param vehicle the object that gonna have this state
     */
    public RentedState(Vehicle vehicle){
        super(vehicle);
        this.stateDescription = "Rented";
    }
}