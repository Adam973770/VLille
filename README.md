# Projet : Velos Libre Service 

## Membre du Projet 

- Adam RAMJATTAN
    - Numéro étudiant : 42140181
    - L3 INFO
    - Groupe 6

## Architecture du depôt 

1. Le dossier **src/VLille** contient tous les fichier source du projet
2. Le dossier **test/VLille** contient tous les fichier test du projet
3. Le fichier **UML Projet VeLib.mdj** est l'Uml du projet
4. Le fichier **UML.svg** est l'Uml du projet mais en svg

## UML

![UML](UML.svg)

## Explication de l'Uml

1. Les objets de type Vehicle / se trouvant dans le dossier src/VLille/vehicle
    - La classe **Vehicle** est une classe abstraite servant de parent pour tout les types de vehicule
        - La classe **Bike** est également une classe abstraite servant de parent pour tout les types de vélo et qui herite de Vehicle / se trouvant dans le dossier src/VLille/vehicle/Bike
            - La classe **ElectricBike** représente tout les vélo électrique, cette classe hérite donc de la classe Bike
            - La classe **ClassicBike** représente tout les vélo classic, cette classe hérite donc de la classe Bike

2. Les objets de type Equipement / se trouvant dans le dossier src/VLille/Equipment
    - La classe **Equipement** est une classe abstraite servant de parent a tous les autres objet de type Equipement, un equipement est un objet qui peut etre ajouté a un velo
    - La classe **Basket** herite de Equipement car c'est un equipement
    - La classe **Flashlight** herite de Equipement car c'est un equipement
    - La classe **Bottle** herite de Equipement car c'est un equipement
    - La classe **LuggageRack** herite de Equipement car c'est un equipement 

3. Les objets de type User / se trouvant dans le dossier src/VLille/User
    - La classe **User** est une classe abstraite servant de parent a tous les autres objets de type User, un User est un utilisateur qui vas interagir avec un velo et une station pour soit deposer le velo ou le prendre
        - La classe **Repairer** herite de User, elle represente un reparateur qui a la capacité de réparer un vélo
        - La classe **Painter** herete de User, elle represente un peintre qui a la capacité de changer la couleur d'un vélo
        - La classe **Renter** herite de User, elle represente un utilisateur qui utilise un vélo, donc qui auras la capacité sois de deposer ou de prendre un velo dans une station

4. Les objets de type BikeStation / se trouvant dans le dossier src/VLille/BikeStation
    - La classe **BikeStation** est une classe representant les stations dans lequel uniquement des objets peuvent y être déposés

5. Les objets de type ControlCenter / se trouvant dans le dossier src/VLille/controlCenter
    - La classe **ControlCenter** représente le centre de controle de la ville qui se charger de superviser l’ensemble de la flotte de vélos et des stations

## Déroulement du projet : 
### Semaine 1 :
Commencement de la création de l'Uml du projet sans l'utilisation des pattern.

### Semaine 2 :
Implémentaion de certaines classes sans l'uilisation des pattern : Bike, BikeStation, ControlCenter, User, Equipment

### Semaine 3 :
Décision de quel pattern vont être utilisé lors du projet :

    - pattern Builder pour les User
    - pattern Factory pour les Station
    - pattenr Decorator pour les Vehicle
    - pattern Singleton ou Factory pour le ControlCenter

### Semaine 4 :
Implemention de certaines classes avec cette fois-ci l'utilisation des pattern : User, Painter, Repairer, Renter

### Semaine 5 :
Implemention de certaines classes avec cette fois-ci l'utilisation des pattern : Vehicle, Bike, ClassicBike, ElectricBike, DecorateurBike, Basket, Bottle, Flashlight, LuggageRack

### Semaine 6 :
Implemention de certaines classes avec cette fois-ci l'utilisation des pattern : ControlCenter, Station, BikeStation, StationFactory, StationFactorylmpl