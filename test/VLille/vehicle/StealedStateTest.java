package test.VLille.vehicle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;

public class StealedStateTest extends StateTest {
    @Override
    protected State createState(){
        return new StealedState(this.vehicle);
    }
}