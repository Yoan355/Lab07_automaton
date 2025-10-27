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
    
    private int nextState[];
    
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
     *///36
    
public void update() {
    int left = 0;
int center = state[0];

for (int i=0; i<numberOfCells; i++){
int right = state[i+1];
nextState[i] = calculateNextState(left, center, right);
left = center;
center = right;
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

private int calculateNextState(int left, int center, int right) { //34

   
    return (left + center + right) % 2;
    
    
    
}






}
