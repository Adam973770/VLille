package src.VLille.Exceptions;

/**
 *  Exception thrown when a station is full
 */
public class StationIsFullException extends Exception {
    
    /**
     * Constructs a new StationIsFullException exception with the specified message
     *
     * @param message the message explaining the cause of the exception
     */    
    public StationIsFullException(String message) {
        super(message);
    }
}