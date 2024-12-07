package src.VLille.vehicle;

/**
 * State of a vehicle which represent the context not stealed
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
     * explain that the vehicle is already stealed
     */
    public void stealed(){
        System.out.println("Already stealed");
    }

    /**
     * create a new state for the vehicle representing a broken state
     */
    public void broken(){
        setStateDescription("Broken");
        this.vehicle.setState(new BrokenState(this.vehicle));
    }
}