package VLille.user;
import VLille.vehicle.Bike.*;
import VLille.vehicle.*;

public class Painter extends User{

    /**
     * Constructs a new `Painter` object based on the provided `PainterBuilder`.
     * 
     * @param builder The `PainterBuilder` object containing the information needed to create a `Painter`.
     */
    public Painter(PainterBuilder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.numTel = builder.numTel;
        this.ownedVehicle = builder.ownedVehicle;
    }

    /**
     * The `PainterBuilder` static inner class provides a way to build a `Painter` object
     * using a step-by-step approach. This builder pattern ensures that a `Painter` object 
     * is constructed with the necessary attributes in a readable and organized manner.
     */
    public static class PainterBuilder {

        private String firstName;
        private String secondName;
        private int age;
        private String gender;
        private String address;
        private String numTel;
        private Vehicle ownedVehicle; 

        /**
         * Sets the first name of the Painter.
         * 
         * @param name The first name of the Painter.
         * @return The current `PainterBuilder` instance.
         */
        public PainterBuilder setFirstName(String name) {
            this.firstName = name;
            return this;
        }

        /**
         * Sets the second name (last name) of the Painter.
         * 
         * @param name The second name of the Painter.
         * @return The current `PainterBuilder` instance.
         */
        public PainterBuilder setSecondName(String name) {
            this.secondName = name;
            return this;
        }

        /**
         * Sets the age of the Painter.
         * 
         * @param age The age of the Painter.
         * @return The current `PainterBuilder` instance.
         */
        public PainterBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         * Sets the gender of the Painter.
         * 
         * @param gender The gender of the Painter.
         * @return The current `PainterBuilder` instance.
         */
        public PainterBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Sets the address of the Painter.
         * 
         * @param adress The address of the Painter.
         * @return The current `PainterBuilder` instance.
         */
        public PainterBuilder setAddress(String adress) {
            this.address = address;
            return this;
        }

        /**
         * Sets the phone number of the Painter.
         * 
         * @param num The phone number of the Painter.
         * @return The current `PainterBuilder` instance.
         */
        public PainterBuilder setNumTel(String num) {
            this.numTel = num;
            return this;
        }

        /**
         * Sets the bike owned by the Painter.
         * 
         * @param bike The `Bike` object owned by the Painter.
         * @return The current `PainterBuilder` instance.
         */
        public PainterBuilder setOwnedVehicle(Vehicle vehicle){
            this.ownedVehicle = vehicle;
            return this;
        }

        /**
         * Builds and returns a `Painter` object based on the provided information.
         * 
         * @return A new `Painter` object.
         */
        public Painter build() {
            return new Painter(this);
        }
    }
}