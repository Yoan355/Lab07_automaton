import java.util.Arrays;

/**
 * Model a 1D elementary cellular automaton.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.1
 */
public class Automaton
{
    // The number of cells.
    private final int numberOfCells;
    // The state of the cells.
    private int[] state; /// []
    
    /**
     * Create a 1D automaton consisting of the given number of cells.
     * @param numberOfCells The number of cells in the automaton.
     */
    public Automaton(int numberOfCells)
    {
        this.numberOfCells = numberOfCells;
        state = new int[numberOfCells];
        System.out.print("State: " + (numberOfCells / 2));
        // Seed the automaton with a single 'on' cell in the middle.
        state[numberOfCells / 2] = 1;     ///                                     [0,1,2..]   
        
    }
    
    /**
     * Print the current state of the automaton.
     */
    public void print()
    {
        for(int cellValue : state) {
            if(cellValue == 1) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }   
    
    /**
     * Update the automaton to its next state.
     */
    public void update() //30
{
    // Build the new state in a separate array.
    int[] nextState = new int[state.length]; //Creates nextState array
    //with same length of current state.This is where updates values are stored
 
    for(int i = 0; i < state.length; i++)// A loop that goes through every cell in the state array.
 {
        int left = (i == 0) ? 0 : state[i - 1];//If i==0,there is no left cell so we use 0,else we do i-1 in the state array.
        int center = state[i];//gets the current cell value
        int right = (i + 1 < state.length) ? state[i + 1] : 0; // If current cell value + 1 is smaller than the length of array,return i+1 value stored,
        //) else(not within bounds) return 0.
        state[i] = (left + center + right) % 2;//Calculates new value for the current cell and stores the result in nextState[] Array.
    }
    
}

    
    /**
     * Reset the automaton.
     */
    public void reset()
{
    Arrays.fill(state, 0);
    //Q29
    int center = numberOfCells / 2;
    state[center - 1] = 1;
    state[center] = 1;
    state[center + 1] = 1;
}
}
