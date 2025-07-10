import org.junit.Test;
import static org.junit.Assert.*;

public class GradeAnalysisTest {


    @Test(timeout = 1000)
    public void testGradeAnalysisRowSum1() {

        int[] grades = {30, 90, 80, 80, 70};

        String message = "Check GradeAnalysis rowSum()";
        assertEquals(message,  350, GradeAnalysis.rowSum(grades));
    }

    @Test(timeout = 1000)
    public void testGradeAnalysisRowSum2() {

        int[] grades = {90};

        String message = "Check GradeAnalysis rowSum()";
        assertEquals(message,  90, GradeAnalysis.rowSum(grades));
    }

    @Test(timeout = 1000)
    public void testGradeAnalysisRowSum3() {

        int[] grades = {90, 1};

        String message = "Check GradeAnalysis rowSum()";
        assertEquals(message,  91, GradeAnalysis.rowSum(grades));
    }

    @Test(timeout = 1000)
    public void testGradeAnalysisRowsMax1() {

        int[] grades = {90, 1};
        int[] expected = {90, 2};

        String message = "Check GradeAnalysis rowsMax()";
        assertEquals(message,  expected, GradeAnalysis.rowsMax(grades));
    }

    @Test(timeout = 1000)
    public void testGradeAnalysisRowsMax2() {

        int[] grades = {30, 90, 80, 80, 70};
        int[] expected = {90, 5};

        String message = "Check GradeAnalysis rowsMax()";
        assertEquals(message,  expected, GradeAnalysis.rowsMax(grades));
    }

    @Test(timeout = 1000)
    public void testGradeAnalysisIsFair1() {

        int[][] gradesPeriods = {{60, 70, 80, 70, 92},
                                 {80, 70, 90, 90, 90},
                                 {70, 80, 80, 90, 50}};

        String message = "Check GradeAnalysis isFair()";
        assertTrue(message, GradeAnalysis.isFair(gradesPeriods));
    }

    @Test(timeout = 1000)
    public void testGradeAnalysisIsFair2() {

        int[][] gradesPeriods = {{60, 70, 80, 70, 92},
                                 {85, 50, 90, 90, 60},
                                 {70, 80, 60, 90, 50}};

        String message = "Check GradeAnalysis isFair()";
        assertFalse(message, GradeAnalysis.isFair(gradesPeriods));
    }
}
