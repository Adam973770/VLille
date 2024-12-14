package src.VLille.Exceptions;

/**
 *  Exception thrown when a station is already empty
 */
public class StationIsAlreadyEmpty extends Exception {
    
    /**
     * Constructs a new StationIsAlreadyEmpty exception with the specified message
     *
     * @param message the message explaining the cause of the exception
     */
    public StationIsAlreadyEmpty(String message) {
        super(message);
    }
}