package VLille.user;
import VLille.vehicle.Bike.*;

public class Painter extends User{

    public Painter (PainterBuilder builder){
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.numTel = builder.numTel;
        this.ownedBike = builder.ownedBike;
    }

    public static class PainterBuilder {
        private String firstName;
        private String secondName;
        private int age;
        private String gender;
        private String address;
        private String numTel;
        private Bike ownedBike; 

        public PainterBuilder setFirstName(String name){
            this.firstName = name;
            return this;
        }

        public PainterBuilder setSecondName(String name){
            this.secondName = name;
            return this;
        }

        public PainterBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public PainterBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public PainterBuilder setAddress(String adress){
            this.address = address;
            return this;
        }   

        public PainterBuilder setNumTel(String num){
            this.numTel = num;
            return this;
        }

        public PainterBuilder setOwnedBike(Bike bike){
            this.ownedBike = bike;
            return this;
        }

        public Painter build(){
            return new Painter(this);
        }
        
    }
}