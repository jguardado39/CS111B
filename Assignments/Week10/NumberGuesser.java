package Assignments.Week10;

/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class NumberGuesser {
    // Required fields
    protected int lowerBound;
    private int initalLowerBound;
    protected int upperBound;
    private int initalUpperBound;
    protected int currentGuess;

    /*
    * @param lowerBound Lowest number guess can be
    * @param upperBound Highest number guess can be
    */
    public NumberGuesser(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;

        this.initalLowerBound = lowerBound;
        this.initalUpperBound = upperBound;
    }


    public void higher() {
        lowerBound = getCurrentGuess() + 1;
    }



    public void lower() {
        upperBound = getCurrentGuess() - 1;
    }


    /*
    * @return currentGuess The current guess of the game    
    */
    public int displayGuess () {
        return currentGuess;
    }


    /*
    * @return currentGuess Returns current guess of the game
    */
    public int getCurrentGuess() {
        currentGuess = (lowerBound + upperBound) / 2;
        return currentGuess;
    }


    public void reset() {
        lowerBound = initalLowerBound;
        upperBound = initalUpperBound;
        currentGuess = getCurrentGuess();
    }
}