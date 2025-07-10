public class ArrayResizer 
{
    /** Returns true if and only if every value in row r of array2D is non-zero
     * Precondition: r is a valid row index in array2D
     * Postcondition: array2D is unchanged
     */
    public static boolean isNonZeroRow(int[][] array2D, int r){
        /* part a implementation */
       
        for(int j = 0; j < array2D[r].length; j++){
            if(array2D[r][j] == 0){
                return false;
            }
        } 
        return true;
    } 


    /** Returns the number of rows in array2D that contain all non-zero values
     * Postcondition: array2D is unchanged
     */
    public static int numNonZeroRows(int[][] array2D)
    {
        int count = 0;
        boolean nonZero = true;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == 0) {
                    nonZero = false;
                }
            }
            if (nonZero) {
                count++;
            }
            else {
                nonZero = true;
            }
        }
        return count; 

        // when isNonZero() is implemented, uncomment this section:
        /*
         *         
        * for (int i = 0; i < array2D.length; i++) {
            if (isNonZero(array2D, i)) {
               count++;
            }
        }
         */
    }

    /** Returns a new, possibly smaller, two-dimensional array that contains only rows
     * from array2D with no zeros, as described in part b
     * Precondition: array2D contains at least one column and at least one row with no zeroes
     * Postcondition: array2D is unchanged
     */
    public static int[][] resize(int[][] array2D){
        /* to be implemented in part b */
        int rows = numNonZeroRows(array2D);
        int[][] smaller = new int[rows][array2D[0].length];
        int count = 0;
        for(int i = 0; i < array2D.length; i++){
            if (isNonZeroRow(array2D, i) == true){
                smaller[count] = array2D[i];
            }
        }
        return smaller;
    }
}

//