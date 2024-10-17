package VLille.user;
import VLille.user.*;
public class Main{
 public static void main(String [] args){
    Painter painter = new Painter.PainterBuilder().setFirstName("Jeanne").setGender("Femme").build();
    System.out.println(painter.getFirstName());
    Renter renter = new Renter.RenterBuilder().setFirstName("Theo").setGender("Homme").build();
    System.out.println(renter.getFirstName());
    Repairer repairer = new Repairer.RepairerBuilder().setFirstName("Theophane").setGender("Homme").build();
    System.out.println(repairer.getFirstName());
 }
}
