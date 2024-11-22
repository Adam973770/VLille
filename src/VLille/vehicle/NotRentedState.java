package VLille.vehicle;

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

    /**
     * create a new state for the vehicle representing a rented state
     */
    public void rented(){
        this.vehicle.setState(new RentedState(this.vehicle));
    }

    /**
     * explain that the vehicle is already not rented
     */
    public void notRented(){
        System.out.println("Already not rented");
    }

    /**
     * create a new state for the vehicle representing a stealed state
     */
    public void stealed(){
        this.vehicle.setState(new StealedState(this.vehicle));
    }

    /**
     * create a new state for the vehicle representing a broken state
     */
    public void broken(){
        this.vehicle.setState(new BrokenState(this.vehicle));
    }
}