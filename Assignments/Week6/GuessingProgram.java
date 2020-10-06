package Assignments.Week6;
import java.util.Scanner;
// import java.util.Random;


/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class GuessingProgram {
    
    /*
    * 
    * Input: NumberGuess
    * Output: void
    * This will generate the Number Guessing game
    * 
    */

    public static void playGame(NumberGuesser guess) {
        char userReponse = 'a';

        System.out.println("Guess a number between 1 and 100.");
        // Will loop as long as midpoint is not correct
        do {
            userReponse = getUserReponseToGuess(guess.getCurrentGuess());
            if (userReponse == 'h' || userReponse == 'H') {
                guess.higher();
            } else {
                guess.lower();
            }
        } while (userReponse != 'c' && userReponse != 'C');

        System.out.printf("You picked %d? Great pick.\n", guess.displayGuess());
    }


    /*
    *
    * Input: int
    * Output: char
    * This will find the user's response if the guess was 
    * high (h), low(l), or correct (c)
    *
    */
    public static char getUserReponseToGuess(int guess) {
        System.out.printf("Is it %d? (h/l/c): ", guess);
        char response = userInput().next().charAt(0); 
        return response;
    }


    /*
    *
    * Input: none
    * Output: Scanner
    * This will enable the Scanner for use.
    *
    */
    
    public static Scanner userInput() {
        Scanner input = new Scanner(System.in);
        return input;
    }


    /*
    *
    * Input: none
    * Output: boolean
    * Will ask user if they want to play again.
    *
    */
    public static boolean shouldPlayAgain() {
        System.out.print("Do you want to play again? (y/n): ");
        char playAgain = userInput().next().charAt(0);

        if (playAgain == 'y' || playAgain == 'Y') {
            
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        do {
            NumberGuesser ng = new NumberGuesser(1, 100);
            playGame(ng);
            ng.reset();
        } while (shouldPlayAgain());
        System.out.println("Good bye.");

    // final int GAME_COUNT = 10000;
    // final int MIN = 1;
    // final int MAX = 100;

    // Random random = new Random();
    // NumberGuesser guesser = new NumberGuesser(MIN, MAX);
    // int totalGuessCount = 0;

    // // Make the guesser look for a random number, GAME_COUNT times
    // for (int i = 0; i < GAME_COUNT; i++) {
    //     System.out.println("Loop: " + (i + 1));
    //     // There is always the initial guess
    //     int guessCount = 1;
    //     // Generate a random value to look for, from MIN to MAX, inclusive.
    //     int targetValue = MIN + random.nextInt(MAX - MIN + 1);
    //     // int targetValue = 100;
    //     System.out.println("Value: " + targetValue);
    //     // Keep looping until the guesser gets it right
    //     while (targetValue != guesser.getCurrentGuess()) {
    //         // Adjust the guesser, as needed...
    //         if (targetValue > guesser.getCurrentGuess()) {
    //             guesser.higher();
    //         } else {
    //             guesser.lower();
    //         }
    //         // That's one more guess, bump up the count
    //         guessCount++;
    //     }
    //     // Keep track of the total number of guesses in all the simulated games
    //     System.out.println("Guess Count: " + guessCount);
    //     totalGuessCount += guessCount;
    //     // Return the guesser is in its initial state
    //     guesser.reset();
    // }
    // // Calculate and display the average
    // double averageGuessCount = totalGuessCount / (double) GAME_COUNT;
    // System.out.println("Average number of guesses: " + averageGuessCount);
    }
}