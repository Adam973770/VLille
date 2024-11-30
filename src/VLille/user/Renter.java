package VLille.user;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;

public class Renter extends User{

    /**
     * Constructs a new `Renter` object based on the provided `RenterBuilder`.
     * 
     * @param builder The `RenterBuilder` object containing the information needed to create a `Renter`.
     */
    public Renter(RenterBuilder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.numTel = builder.numTel;
        this.ownedVehicle = builder.ownedVehicle;
    }

    /**
     * The `RenterBuilder` static inner class provides a way to build a `Renter` object
     * using a step-by-step approach. This builder pattern ensures that a `Renter` object 
     * is constructed with the necessary attributes in a readable and organized manner.
     */
    public static class RenterBuilder {

        private String firstName;
        private String secondName;
        private int age;
        private String gender;
        private String address;
        private String numTel;
        private Vehicle ownedVehicle; 

        /**
         * Sets the first name of the Renter.
         * 
         * @param name The first name of the Renter.
         * @return The current `RenterBuilder` instance.
         */
        public RenterBuilder setFirstName(String name) {
            this.firstName = name;
            return this;
        }

        /**
         * Sets the second name (last name) of the Renter.
         * 
         * @param name The second name of the Renter.
         * @return The current `RenterBuilder` instance.
         */
        public RenterBuilder setSecondName(String name) {
            this.secondName = name;
            return this;
        }

        /**
         * Sets the age of the Renter.
         * 
         * @param age The age of the Renter.
         * @return The current `RenterBuilder` instance.
         */
        public RenterBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         * Sets the gender of the Renter.
         * 
         * @param gender The gender of the Renter.
         * @return The current `RenterBuilder` instance.
         */
        public RenterBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Sets the address of the Renter.
         * 
         * @param adress The address of the Renter.
         * @return The current `RenterBuilder` instance.
         */
        public RenterBuilder setAddress(String adress) {
            this.address = address;
            return this;
        }

        /**
         * Sets the phone number of the Renter.
         * 
         * @param num The phone number of the Renter.
         * @return The current `RenterBuilder` instance.
         */
        public RenterBuilder setNumTel(String num) {
            this.numTel = num;
            return this;
        }

        /**
         * Sets the bike owned by the Renter.
         * 
         * @param bike The `Bike` object owned by the Renter.
         * @return The current `RenterBuilder` instance.
         */
        public RenterBuilder setOwnedVehicle(Vehicle vehicle){
            this.ownedVehicle = vehicle;
            return this;
        }

        /**
         * Builds and returns a `Renter` object based on the provided information.
         * 
         * @return A new `Renter` object.
         */
        public Renter build() {
            return new Renter(this);
        }
    }
}