package controlCenter;
/**
 * class for ControlCenter
 */
public class ControlCenter{
    
    private static ControlCenter uniqueInstance;

    private ControlCenter(){}

    public static ControlCenter getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ControlCenter();
        }
        return uniqueInstance;
    }
}