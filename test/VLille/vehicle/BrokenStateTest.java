package test.VLille.vehicle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;

public class BrokenStateTest extends StateTest {
    @Override
    protected State createState(){
        return new BrokenState(this.vehicle);
    }
}