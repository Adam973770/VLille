package test.VLille.vehicle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;


public abstract class StateTest {
    protected State state;

    @BeforeEach
    public void init(){
        this.state = createState();
    }

    protected abstract State createState();

    @Test
    public void rentedStateChangeCheck(){
        this.state.rented();
        assertEquals(this.state.getStateDescription(), "Rented");
    }
}