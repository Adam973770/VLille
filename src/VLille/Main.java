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
        //création d'un random
        Random random = new Random();
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
        //Liste de Renter
        List<User> renters = new ArrayList<>();
        renters.add(new Renter.RenterBuilder().setFirstName("Theo").setGender("Homme").build());
        renters.add(new Renter.RenterBuilder().setFirstName("Paul").setGender("Homme").build());
        renters.add(new Renter.RenterBuilder().setFirstName("Celia").setGender("Femme").build());
        renters.add(new Renter.RenterBuilder().setFirstName("Jeane").setGender("Femme").build());
        renters.add(new Renter.RenterBuilder().setFirstName("Jeab").setGender("Homme").build());
        //un peintre
        Painter painter = new Painter.PainterBuilder().setFirstName("Jeanne").setGender("Femme").build();
        // un repareur
        Repairer repairer = new Repairer.RepairerBuilder().setFirstName("Theophane").setGender("Homme").build();
        // un voleur
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
        System.out.println("\u001B[32mDébut de la prise en charge des stations par le centre de contrôle\u001B[0m");
        //debut du loop
        for (int i = 0; i< 10; i++){
            System.out.println("\u001B[33mDébut du " + (i + 1) + " loop\u001B[0m");
            //le repareur repare
            for (Station station : controlCenter.getAllBikeStation()){
                for (Vehicle vehicle : station.getAllVehicle()){
                    if (vehicle!=null && vehicle.getNbUsage() == 0){
                        action.repair(repairer, vehicle);
                        System.out.println(vehicle.getVehicleId() + " a été réparé");
                    }
                }
            }

            // les renter drop
            for (User renter : renters) {
                if (renter.getOwnedVehicle() != null && random.nextInt(5) == 1){
                    boolean dropped = false;
                    for (Station station : controlCenter.getAllBikeStation()){
                        try {
                            action.drop(renter, station);
                            dropped = true;
                            //break;
                        }catch(StationIsFullException e){
                            System.out.println("Pas de place dans " + station.getId());
                        }
                    }
                    if (!dropped){
                        System.out.println(renter.getFirstName() + " n'a pas trouvé de station pour déposer son velo");
                    }
                }
            }

            // Les renter louent
            for (User renter : renters) {
                if (renter.getOwnedVehicle() == null) {
                    boolean taked = false;
                    // Mélanger la liste des stations pour choisir une station aléatoirement
                    List<Station> shuffledStations = new ArrayList<>(controlCenter.getAllBikeStation());
                    Collections.shuffle(shuffledStations);
                    
                    for (Station station : shuffledStations) {
                        try {
                            action.rent(renter, station);
                            taked = true;
                            //break;
                        } catch (StationIsAlreadyEmpty e) {
                            System.out.println("Pas de vehicule disponible dans " + station.getId());
                        }
                    }
                    if (!taked) {
                        System.out.println(renter.getFirstName() + " n'a pas trouvé de velo à louer");
                    }
                }
            }

            //check le intervale before steal de chaque vehicle du systeme
            for (Station station : controlCenter.getAllBikeStation()){
                for (Vehicle vehicle : station.getAllVehicle()){
                    if (vehicle != null){
                        vehicle.setIntervaleBeforeSteal(vehicle.getIntervaleBeforeSteal() - 1);
                    }
                }
            }

            //Le voleur peut voler
            action.steal(thief, controlCenter.getAllBikeStation());
            System.out.println("\u001B[31mLe voleur a volé " + thief.getVehiclesteal().size() + " Véhicules depuis la prise en charge du centre de contrôle\u001B[0m");

            //check les slots restant dans chaque station
        }
        System.out.println("\u001B[32mFin de la prise en charge des stations par le centre de contrôle\u001B[0m");
    }
}