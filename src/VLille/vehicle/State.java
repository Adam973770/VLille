package VLille.vehicle;

/**
 * State of a vehicle which change depending on the context
 */
public interface State {

    /**
     * Return if the available or not
     * @return true if the vehicle is available else false
     */
    public boolean available();
}