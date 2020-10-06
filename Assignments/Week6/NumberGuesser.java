package Assignments.Week6;

/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class NumberGuesser {
    // Required fields
    private int lowerBound;
    private int initalLowerBound;
    private int upperBound;
    private int initalUpperBound;
    private int currentGuess;

    /*
    *
    * Input: int x2
    * Output: none
    * This will assign the variable(s) to this class
    *
    */
    public NumberGuesser(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound - 1;
        this.upperBound = upperBound + 1;
        this.initalLowerBound = lowerBound;
        this.initalUpperBound = upperBound + 1;
    }


    /*
    *
    * Input: none
    * Output: void
    * Will set the lowerbound to the currentGuess
    *
    */
    public void higher() {
        lowerBound = currentGuess;
    }


    /*
    *
    * Input: none
    * Output: void
    * Will set the upperbound to the currentGuess
    *
    */
    public void lower() {
        upperBound = currentGuess;
    }


    /*
    *
    * Input: none
    * Output: int
    * Will display currentGuess to user. 
    * Since I do not have a way to display currentGuess
    * without having a new iteration of the method I thought
    * this would be an easy workaround.
    *
    */
    public int displayGuess () {
        return currentGuess;
    }

    /*
    *
    * Input: None
    * Output: int
    * This creates the Binary Search Algorithm in order to find
    * midpoint (x + y) / 2 and if (x + y) % 2 == 1 
    * then it will round down
    *
    */
    public int getCurrentGuess() {
        currentGuess = (lowerBound + upperBound) / 2;
        return currentGuess;
    }


    /*
    *
    * Input: None
    * Output: Void
    * This will reset the lowerBound and upperBound
    * to the intial elemenets of the class.
    * Generates a new currentGuess for the reset 
    * lowerBound & upperBound
    *
    */
    public void reset() {
        lowerBound = initalLowerBound;
        upperBound = initalUpperBound;
        currentGuess = getCurrentGuess();
    }
}
