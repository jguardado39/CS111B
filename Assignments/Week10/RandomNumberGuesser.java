package Assignments.Week10;
import java.util.Random;

/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class RandomNumberGuesser extends NumberGuesser {
    private int randomMidpoint;
    private Random newRandom;
    private boolean testRandom;
    

    /*
    * @param lowerBound Min amount of guess
    * @param upperBound Max amount of guess
    */
    public RandomNumberGuesser(int lowerBound, int upperBound) {
        super(lowerBound, upperBound);
        testRandom = true;
        newRandom = new Random();
    }


    @Override
    public void higher() {
        super.higher();
        testRandom = true;
    }


    
    @Override
    public void lower() {
        super.lower();
        testRandom = true;
    }


    /*
    * @return randomMidpoint Will display random midpoint
    */
    @Override
    public int displayGuess() {
        return randomMidpoint;
    }

    @Override
    public int getCurrentGuess() {
        if (testRandom) {
            System.out.printf("Lower: %s\nUpperBound: %s\n",lowerBound,upperBound);
            randomMidpoint = lowerBound + (newRandom.nextInt((upperBound - lowerBound) + 1));
            testRandom = false;
        }
        return randomMidpoint;
    }


    @Override
    public void reset() {
        super.reset();
    }
}