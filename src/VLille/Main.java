package src.VLille;
import src.VLille.*;
import src.VLille.Station.*;
import java.util.*;
import src.VLille.vehicle.*;
import src.VLille.user.*;
import src.VLille.controlCenter.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.vehicle.Bike.equipment.*;
import src.VLille.Exceptions.*;

public class Main {
    public static void main(String [] args) throws StationIsAlreadyEmpty, StationIsFullException{
        //création du centre de controle
        ControlCenter controlCenter = ControlCenter.getInstance();
        //création de 4 stations
        System.out.println("Ajout de 4 station qui vont être gestionner par le centre de controle");
        Station station1 = new Station(controlCenter);
        Station station2 = new Station(controlCenter);
        Station station3 = new Station(controlCenter);
        Station station4 = new Station(controlCenter);
        //ajout des station au centre de controle
        controlCenter.addStation(station1);
        controlCenter.addStation(station2);
        controlCenter.addStation(station3);
        controlCenter.addStation(station4);
        //création de quelque user
        Renter renter = new Renter.RenterBuilder().setFirstName("Theo").setGender("Homme").build();
        Painter painter = new Painter.PainterBuilder().setFirstName("Jeanne").setGender("Femme").build();
        Repairer repairer = new Repairer.RepairerBuilder().setFirstName("Theophane").setGender("Homme").build();
        Thief thief = new Thief.ThiefBuilder().setFirstName("Leo").setGender("Homme").build();
        //création de l'interface action
        ActionUser action = new ActionUserlmpl();
        //création des FactoryBike
        ElectricBikeFactory electricBikeFactory = new ElectricBikeFactory();
        ClassicBikeFactory classicBikeFactory = new ClassicBikeFactory();
        //ajout des bike dans les stations
        try {
            //station1 
            //ajout de 5 electricBike
            System.out.println("Ajout de quelques vélos a la premiere station");
            for (int i = 0; i<5; i++){
                station1.dropVehicle(electricBikeFactory.createBike());
            }
            //ajout de 4 classicBike
            for (int i = 0; i<4; i++){
                station1.dropVehicle(classicBikeFactory.createBike());
            }
            //station2
            //ajout de 5 electricBike
            System.out.println("Ajout de quelques vélos a la deuxieme station");
            for (int i = 0; i<5; i++){
                station2.dropVehicle(electricBikeFactory.createBike());
            }
            //ajout de 4 classicBike
            for (int i = 0; i<4; i++){
                station2.dropVehicle(classicBikeFactory.createBike());
            }
            //station3
            //ajout de 5 electricBike
            System.out.println("Ajout de quelques vélos a la troisieme station");
            for (int i = 0; i<5; i++){
                station3.dropVehicle(electricBikeFactory.createBike());
            }
            //ajout de 4 classicBike
            for (int i = 0; i<4; i++){
                station3.dropVehicle(classicBikeFactory.createBike());
            }
            //station4
            //ajout de 5 electricBike
            System.out.println("Ajout de quelques vélos a la quatriéme station");
            for (int i = 0; i<5; i++){
                station4.dropVehicle(electricBikeFactory.createBike());
            }
            //ajout de 4 classicBike
            for (int i = 0; i<4; i++){
                station4.dropVehicle(classicBikeFactory.createBike());
            }
        }catch (Exception e){
            System.out.println(e);
        }

        //debut du loop
    }
}