package VLille.user;
import VLille.user.*;
public class Main{
 public static void main(String [] args){
    User user = new UserBuilder().setFirstName("Jean").setGender("Homme").build();
    System.out.println(user.getFirstName());
 }
}