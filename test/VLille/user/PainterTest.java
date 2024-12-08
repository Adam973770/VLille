package test.VLille.user;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.user.*;

public class PainterTest extends UserTest{

    @Override
    public User createUser(){
        return new Painter.PainterBuilder().setFirstName("Jeanne").setGender("Femme").build();
    }
}