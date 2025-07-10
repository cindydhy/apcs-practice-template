import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Testing CarSimulator 
 */
public class CarSimulatorTest {

    @Test(timeout = 1000)
    public void testCarSimulatorConstructor() {
        int[] destination = {3, 5};
        CarSimulator car = new CarSimulator(destination, 10);

        String message = "Check CarSimulator object.";
        assertNotNull(message, car);
    }

    // @Test(timeout = 1000)
    // public void testTripSpeed() {
    //     int[] destination = {100, 200};

    //     CarSimulator car = new CarSimulator(destination, 10);
    //     // check when recentTime = 5;

    //     String message = "Check trip speed method.";
    //     assertEquals(message, 44.7, car.tripSpeed(), 0.1);
    // }
}