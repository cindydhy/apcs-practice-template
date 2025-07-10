public class CarSimulator
{
    /** (x, y) coordinates of the destination in meters */
    private int[] destination;

    /** maximum amount of time in seconds to run the simulation */
    private int timeLimit;

    /** most recent duration, in seconds, of a successful drive that was completed. */
    private int recentTime = 0;

    /** Constructs a CarSimulator with a destination to reach and time limit
     *  to reach it in. timeLimit > 0
     */
    public CarSimulator(int[] goal, int time)
    {
        destination = goal;
        timeLimit = time;
    }

    /* returns an integer array with x and y distances traveled in the next second
     * in the form of {x , y}
     */
    public int[] move()
    { return new int[0]; }

    /* Simulates the car driving to its destination. Returns true when the 
     * destination is reached and false if the destination is not reached.
     */
    public boolean drive()
    { 
        return true;
    }

    /* Returns the fastest average speed to get from (0, 0) to the destination using the 
     * most recent successful time
     */
    public double tripSpeed()
    { 
        return 0;
    }
}