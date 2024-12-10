package src.VLille.vehicle;

/**
 * State of a vehicle which represent the context broken
 */
public class BrokenState extends State{
    /**
     * Construct a new `BrokenState` Object
     * 
     * @param vehicle the object that gonna have this state
     */
    public BrokenState(Vehicle vehicle){
        super(vehicle);
        this.stateDescription = "Broken";
    }
}