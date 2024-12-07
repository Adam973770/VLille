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

    /**
     * create a new state for the vehicle representing a rented state
     */
    public void rented(){
        this.vehicle.setState(new RentedState(this.vehicle));
    }

    /**
     * create a new state for the vehicle representing a not rented state
     */
    public void notRented(){
        this.vehicle.setState(new NotRentedState(this.vehicle));
    }

    /**
     * create a new state for the vehicle representing a stealed state
     */
    public void stealed(){
        this.vehicle.setState(new StealedState(this.vehicle));
    }

    /**
     * explain that the vehicle is already broken
     */
    public void broken(){
        System.out.println("Already broken");
    }
}