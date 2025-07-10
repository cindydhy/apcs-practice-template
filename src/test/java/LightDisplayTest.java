import org.junit.Test;
import static org.junit.Assert.*;

public class LightDisplayTest {

    @Test(timeout = 1000)
    public void testLightDisplayConstructor1() {
        int rows = 5;
        int cols = 5;

        LightDisplay ld = new LightDisplay(rows, cols);

        String message = "Check LightDisplay object.";
        assertNotNull(message, ld);
    }

    @Test(timeout = 1000)
    public void testLightAnalysis() {
        int rows = 5;
        int cols = 5;

        LightDisplay ld = new LightDisplay(rows, cols);

        boolean[][] lightGrid = {{true, true, true, true, true},
                                 {true, true, true, true, true},
                                 {true, true, true, true, true}};

        String message = "Check LightDisplay object.";
        assertNotNull(message, ld);
    }
}
