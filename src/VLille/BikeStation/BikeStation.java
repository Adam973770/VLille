package VLille.BikeStation;

import java.util.*;
import VLille.Bike.*;
import VLille.Exceptions.*;

/**
 * class for a BikeStation
 */
public class BikeStation {

    /** the Id of the BikeStation */
    protected String BikeStationId;

    /** The Bikes in the BikeStation */
    protected List<Bike> theBikes;

    /** The number of Bikes in this BikeStation */
    protected int capacity = this.generateRandomCapacity();

    /**
     * Constructor of the BikeStation
     * 
     * @param BikeStationId the Id of the BikeStation
     */
    public BikeStation(String BikeStationId) {
        this.BikeStationId = BikeStationId;
        this.theBikes = new ArrayList<Bike>(this.capacity);
        for (int i = 0; i < this.capacity; i++) {
            this.getTheBikes().add(new Bike("Bike" + i));
        }
    }

    /**
     * Get the Id of the BikeStation
     * 
     * @return the Id of the BikeStation
     */
    public String getBikeStationId() {
        return this.BikeStationId;
    }

    /**
     * Get all the Bikes of this BikeStation
     * 
     * @return the Bikes of this BikeStation
     */
    public List<Bike> getTheBikes() {
        return this.theBikes;
    }

    /**
     * Get the capacity of the BikeStation
     * 
     * @return the capacity of the BikeStation
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Generate a random number between 10 and 20 for the capacity of the
     * BikeStation
     * 
     * @return the capacity of the BikeStation
     */
    public int generateRandomCapacity() {
        Random random = new Random();
        int min = 10;
        int max = 20;

        // Générer un entier aléatoire entre min et max (inclus)
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * get the number of Bikes currently in the BikeStation
     * 
     * @return number of Bikes currently in the BikeStation
     */
    public int getNumberOfBikes() {
        int currentlyPresentBikes = 0;
        for (int i = 0; i < this.getCapacity(); i++) {
            if (this.getTheBikes().get(i) != null) {
                currentlyPresentBikes++;
            }
        }
        return currentlyPresentBikes;
    }

    /**
     * get the first free slot in the Bike station
     * 
     * @return the first index of the free slot, if the Bike station is full return
     *         -1
     */
    public int firstFreeSlot() {
        int slot = 0;
        while (slot < this.getCapacity()) {
            if (this.getTheBikes().get(slot) == null) {
                return slot;
            }
            slot++;
        }
        return -1;
    }

    /**
     * drop a bike off in the Bike station if it's possible
     * 
     * @param bike the bike to drop
     * @return true if the bike had droped, else the Bike station is full and return
     *         false
     */
    public boolean addBike(Bike bike) {
        int slot = this.firstFreeSlot();
        if (slot != -1) {
            this.getTheBikes().set(slot, bike);
            return true;
        }
        return false;
    }

     /**
      * take a bike in the Bike station if it's possible   
      * @param i index of a slot 
      * @return the bike if the bike have been taken, else return a BikeNotAvailableException.
      * @exception BikeNotAvailableException if the index is more big than the length of the station, or if  the index is negatif, or if the slot is null  
      */
     public Bike takeBike(int index) throws BikeNotAvailableException {
        try {
            return this.getTheBikes().get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new BikeNotAvailableException("Bike not available");
        }
     }

    /**
     * Two BikeStations are equals if same Id
     * 
     * @return true if equals, false if not
     */
    public boolean equals(Object o) {
        try {
            BikeStation Other = (BikeStation) o;
            return this.getBikeStationId().equals(Other.getBikeStationId());
        } catch (ClassCastException e) {
            return false;
        }
    }

    /**
     * Get a description of the BikeStation
     * 
     * @return a description of the BikeStation
     */
    public String toString() {
        return "BikeStation : " + this.getBikeStationId();
    }
}