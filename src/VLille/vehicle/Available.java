package VLille.vehicle;

/**
 * State where the vehicle is available
 */
public class Available implements State {
    
    /**
     * Construct an object Available
     */
    public Available () {

    }

    @Override
    public boolean available(){
        return true;
    }
}