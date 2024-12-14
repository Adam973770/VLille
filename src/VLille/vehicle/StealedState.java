package src.VLille.vehicle;

/**
 * State of a vehicle which represent the context stealed
 */
public class StealedState extends State{
    /**
     * Construct a new `StealedState` Object
     * 
     * @param vehicle the object that gonna have this state
     */
    public StealedState(Vehicle vehicle){
        super(vehicle);
        this.stateDescription = "Stealed";
    }
}