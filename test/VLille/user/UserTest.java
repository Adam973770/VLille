package test.VLille.user;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import src.VLille.vehicle.*;
import src.VLille.vehicle.Bike.*;
import src.VLille.user.*;

public abstract class UserTest {

    protected User user;

    @BeforeEach
    public void init(){
        this.user = createUser();
    }

    public abstract User createUser();

    @Test
    public void checkTheBuilderPatternHasBeenCorrectlyInstancied(){
        assertTrue(this.user.getFirstName() != null);
        assertTrue(this.user.getGender() != null);
        assertEquals(this.user.getAge(), 0);
        assertEquals(this.user.getOwnedVehicle(), null);
    }
}