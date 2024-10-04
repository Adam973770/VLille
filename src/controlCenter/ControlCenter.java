package controlCenter;
/**
 * class for ControlCenter
 */
public class ControlCenter{
    /**création sous forme de singleton */
    private static ControlCenter uniqueInstance;

    private int timer;
    private ArrayList<BikeStation> allBikeStation;

    private ControlCenter(int size){
        this.timer=0;
        this.allBikeStation= new ArrayList<BikeStation>(size);
    }

    public static ControlCenter getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ControlCenter();
        }
        return uniqueInstance;
    }

    public int getTimer(){
        return this.timer;
    }

    public ArrayList<BikeStation> getAllBikeStation(){
        return this.allBikeStation;
    }


}