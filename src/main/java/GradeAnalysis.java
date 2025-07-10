/**
 * This question focuses on arrays of integers. 
 * You will write three static methods, all three of which are in a class named GradeAnalysis. 
 * The first method returns the sum of the values in a one-dimensional array. 
 * The second method returns an array containing the highest value and the number of elements 
 * contained in a one-dimensional array. The third method analyzes a two-dimensional array.
 */

 public class GradeAnalysis {

    /** Returns the sum of the entries in the one-dimensional array arr. */
    public static int rowSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /** Returns a one-dimensional array in which the entry at index
     * 0 is the maximum value of array arr and the entry at index 1 
     * is the number of elements in arr. 
     */

    public static int[] rowsMax(int[] arr) {
        int min = 0;
        int count = 0;
        int[] rowsMaxArr;

        for (int i = 0; i < arr.length; i++){
            if(min >= arr[i]){
                min = arr[i];
                count++;
            }
            
        }
        return null;
        
        // rowsMaxArr.add(min);
        // rowsMaxArr.add(count);
        // System.out.println(rowsMaxArr);
    // }</arr.length();>
    }
    

    /** Returns true if the difference between the average value of arr
     * and the highest value of arr is less than or equal to 15; 
     * false otherwise.
     */
    public static boolean isFair(int[][] arr) {
        // public boolean average(double scores, double elements) {
            // double avg = scores / elements;
            // System.out.println(avg);

        // if (rowsMax(0) - avg <= 15)
            // return true;
        // else 
            // return false;
        // }
        // average(rowSum, rowsMax(1))
        return true;
    }
}
