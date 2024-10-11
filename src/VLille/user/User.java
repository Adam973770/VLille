package VLille.user;
import VLille.vehicle.Bike.*;

public class User{
    protected String firstName;
    protected String secondName;
    protected int age;
    protected String gender;
    protected String adress;
    protected String numTel;
    protected Bike ownedBike;

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

    public User(UserBuilder builder){
        this.firstName = builder.getFirstName();
        this.secondName = builder.getSecondName();
        this.age = builder.getAge();
        this.gender = builder.getGender();
        this.adress = builder.getAdress();
        this.numTel = builder.getNumTel();
        this.ownedBike = builder.getOwnedBike();
    }
}