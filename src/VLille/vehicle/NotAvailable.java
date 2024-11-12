package VLille.vehicle;

/**
 * State where the vehicle is not available
 */
public class NotAvailable implements State {
    
    /**
     * Construct an object NotAvailable
     */
    public NotAvailable () {

    }

    @Override
    public boolean available(){
        return false;
    }
}