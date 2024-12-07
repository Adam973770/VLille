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

    /**
     * explain that the vehicle is already rented
     */
    public void rented(){
        System.out.println("Already rented");
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
     * create a new state for the vehicle representing a broken state
     */
    public void broken(){
        this.vehicle.setState(new BrokenState(this.vehicle));
    }
}