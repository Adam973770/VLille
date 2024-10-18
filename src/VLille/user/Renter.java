package VLille.user;
import VLille.vehicle.Bike.*;

public class Renter extends User{

    public Renter (RenterBuilder builder){
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.numTel = builder.numTel;
        this.ownedBike = builder.ownedBike;
    }

    public static class RenterBuilder {
        private String firstName;
        private String secondName;
        private int age;
        private String gender;
        private String address;
        private String numTel;
        private Bike ownedBike; 

        public RenterBuilder setFirstName(String name){
            this.firstName = name;
            return this;
        }

        public RenterBuilder setSecondName(String name){
            this.secondName = name;
            return this;
        }

        public RenterBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public RenterBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public RenterBuilder setAddress(String adress){
            this.address = address;
            return this;
        }   

        public RenterBuilder setNumTel(String num){
            this.numTel = num;
            return this;
        }

        public RenterBuilder setOwnedBike(Bike bike){
            this.ownedBike = bike;
            return this;
        }

        public Renter build(){
            return new Renter(this);
        }
        
    }
}