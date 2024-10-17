package VLille.user;
import VLille.vehicle.Bike.*;

public abstract class User{
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
}