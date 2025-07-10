import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Testing ScoresIncreasing 
 */
public class ScoresIncreasingTest {

    @Test(timeout = 1000)
    public void testScoresIncreasing1() {
        ScoresIncreasing si = new ScoresIncreasing();

        int[] scores = {1, 2, 3, 4, 5};

        String message = "Check scenario where all the scores are increasing.";
        assertEquals(message, true, si.scoresIncreasing(scores));
    }

    @Test(timeout = 1000)
    public void testScoresIncreasing2() {
        ScoresIncreasing si = new ScoresIncreasing();

        int[] scores = {1, 3, 2};

        String message = "Check scenario where all the score is decreasing.";
        assertEquals(message, false, si.scoresIncreasing(scores));
    }

    @Test(timeout = 1000)
    public void testScoresIncreasing3() {
        ScoresIncreasing si = new ScoresIncreasing();

        int[] scores = {-1, 0, 2};

        String message = "Check scenario where score is increasing.";
        assertEquals(message, true, si.scoresIncreasing(scores));
    }

    @Test(timeout = 1000)
    public void testScoresIncreasing4() {
        ScoresIncreasing si = new ScoresIncreasing();

        int[] scores = {1, 1, 2, 4, 4, 7};

        String message = "Check scenario where score is increasing.";
        assertEquals(message, true, si.scoresIncreasing(scores));
    }

    @Test(timeout = 1000)
    public void testScoresIncreasing5() {
        ScoresIncreasing si = new ScoresIncreasing();
        
        int[] scores = {1, 1, 2, 4, 3, 7};

        String message = "Check scenario where score is decreasing.";
        assertEquals(message, false, si.scoresIncreasing(scores));
    }
}