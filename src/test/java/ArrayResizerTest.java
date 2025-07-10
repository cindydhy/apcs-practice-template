import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Testing ArrayResizer
 */
public class ArrayResizerTest {

    @Test(timeout = 1000)
    public void testArrayResizerIsNonZeroRow1() {
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };

        String message = "Checking isNonZeroRow()";
        assertFalse(message, ArrayResizer.isNonZeroRow(arr, 0));
    }

    @Test(timeout = 1000)
    public void testArrayResizerIsNonZeroRow2() {
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };

        String message = "Checking isNonZeroRow()";
        assertTrue(message, ArrayResizer.isNonZeroRow(arr, 1));
    }

    @Test(timeout = 1000)
    public void testArrayResizerIsNonZeroRow3() {
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };

        String message = "Checking isNonZeroRow()";
        assertFalse(message, ArrayResizer.isNonZeroRow(arr, 2));
    }

    @Test(timeout = 1000)
    public void testArrayResizerIsNonZeroRow4() {
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };

        String message = "Checking isNonZeroRow()";
        assertTrue(message, ArrayResizer.isNonZeroRow(arr, 3));
    }

    @Test(timeout = 1000)
    public void testArrayResizerResize1() {
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };

        String message = "Checking arr.length after resize()";
      //  System.out.println(ArrayResizer.resize(arr).length);
        assertEquals(message, ArrayResizer.resize(arr).length, 2);
    }

    @Test(timeout = 1000)
    public void testArrayResizerResize2() {
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };

        int[][] arrFinal = { { 1, 3, 2 },
                { 4, 5, 6 } };

        String message = "Checking arr after resize()";
        System.out.println("Array contents: "+ Arrays.deepToString(ArrayResizer.resize(arr)));
        assertEquals(message, Arrays.deepToString(arrFinal), Arrays.deepToString(ArrayResizer.resize(arr)));
    }
}
