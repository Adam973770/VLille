package VLille.vehicle;

public class NotRentedState extends State {

    public NotRentedState(Vehicle vehicle){
        super(vehicle);
        this.stateDescription = "Not rented";
    }

    public void rented(){
        this.vehicle.setState(new RentedState(this.vehicle));
    }
    public void notRented(){
        System.out.println("Already not rented");
    }
    public void stealed(){
        this.vehicle.setState(new StealedState(this.vehicle));
    }
    public void broken(){
        this.vehicle.setState(new BrokenState(this.vehicle));
    }
}