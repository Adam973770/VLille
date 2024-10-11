package VLille.user;
import VLille.vehicle.Bike.*;

public class UserBuilder{
    private String firstName;
    private String secondName;
    private int age;
    private String gender;
    private String adress;
    private String numTel;
    private Bike ownedBike; 

    public UserBuilder setFirstName(String name){
        this.firstName = name;
        return this;
    }

    public UserBuilder setSecondName(String name){
        this.secondName = name;
        return this;
    }

    public UserBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public UserBuilder setGender(String gender){
        this.gender = gender;
        return this;
    }

    public UserBuilder setAdress(String adress){
        this.adress = adress;
        return this;
    }

    public UserBuilder setNumTel(String num){
        this.numTel = num;
        return this;
    }

    public UserBuilder setOwnedBike(Bike bike){
        this.ownedBike = bike;
        return this;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getAdress(){
        return adress;
    }

    public String getNumTel(){
        return numTel;
    }

    public Bike getOwnedBike(){
        return ownedBike;
    }

    public User build(){
        return new User (this);
    }
}