package VLille.user;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;

public class Thief extends User{

    /**
     * Constructs a new `Thief` object based on the provided `ThiefBuilder`.
     * 
     * @param builder The `ThiefBuilder` object containing the information needed to create a `Thief`.
     */
    public Thief(ThiefBuilder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.numTel = builder.numTel;
        this.ownedVehicle = builder.ownedVehicle;
    }

    /**
     * The `ThiefBuilder` static inner class provides a way to build a `Thief` object
     * using a step-by-step approach. This builder pattern ensures that a `Thief` object 
     * is constructed with the necessary attributes in a readable and organized manner.
     */
    public static class ThiefBuilder {

        private String firstName;
        private String secondName;
        private int age;
        private String gender;
        private String address;
        private String numTel;
        private Vehicle ownedVehicle; 

        /**
         * Sets the first name of the Thief.
         * 
         * @param name The first name of the Thief.
         * @return The current `ThiefBuilder` instance.
         */
        public ThiefBuilder setFirstName(String name) {
            this.firstName = name;
            return this;
        }

        /**
         * Sets the second name (last name) of the Thief.
         * 
         * @param name The second name of the Thief.
         * @return The current `ThiefBuilder` instance.
         */
        public ThiefBuilder setSecondName(String name) {
            this.secondName = name;
            return this;
        }

        /**
         * Sets the age of the Thief.
         * 
         * @param age The age of the Thief.
         * @return The current `ThiefBuilder` instance.
         */
        public ThiefBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         * Sets the gender of the Thief.
         * 
         * @param gender The gender of the Thief.
         * @return The current `ThiefBuilder` instance.
         */
        public ThiefBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Sets the address of the Thief.
         * 
         * @param adress The address of the Thief.
         * @return The current `ThiefBuilder` instance.
         */
        public ThiefBuilder setAddress(String adress) {
            this.address = address;
            return this;
        }

        /**
         * Sets the phone number of the Thief.
         * 
         * @param num The phone number of the Thief.
         * @return The current `ThiefBuilder` instance.
         */
        public ThiefBuilder setNumTel(String num) {
            this.numTel = num;
            return this;
        }

        /**
         * Sets the bike owned by the Thief.
         * 
         * @param bike The `Bike` object owned by the Thief.
         * @return The current `ThiefBuilder` instance.
         */
        public ThiefBuilder setOwnedVehicle(Vehicle vehicle){
            this.ownedVehicle = vehicle;
            return this;
        }

        /**
         * Builds and returns a `Thief` object based on the provided information.
         * 
         * @return A new `Thief` object.
         */
        public Thief build() {
            return new Thief(this);
        }
    }
}