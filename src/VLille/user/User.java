package src.VLille.user;
import src.VLille.vehicle.Bike.*;
import src.VLille.vehicle.*;

/**
 * Abstract class representing a user in the VLille system
 */
public abstract class User{
    /** The first name of the user. */
    protected String firstName;
    /** The second name (last name) of the user. */
    protected String secondName;
    /** The age of the user. */
    protected int age;
    /** The gender of the user. */
    protected String gender;
    /** The address of the user. */
    protected String address;
    /** The phone number of the user. */
    protected String numTel;
    /** The vehicle currently owned or rented by the user. */
    protected Vehicle ownedVehicle;

    /**
     * Gets the first name of the user.
     * 
     * @return The first name of the user.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the second name of the user.
     * 
     * @return The second name of the user.
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Gets the age of the user.
     * 
     * @return The age of the user.
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the gender of the user.
     * 
     * @return The gender of the user.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Gets the address of the user.
     * 
     * @return The address of the user.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the phone number of the user.
     * 
     * @return The phone number of the user.
     */
    public String getNumTel() {
        return numTel;
    }

    /**
     * Gets the vehicle currently owned or rented by the user.
     * 
     * @return The vehicle owned or rented by the user, or null if no vehicle is owned.
     */
    public Vehicle getOwnedVehicle() {
        return ownedVehicle;
    }
}