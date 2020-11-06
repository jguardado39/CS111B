package Assignments.Week10;
import java.util.Scanner;


/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class GuessingProgram {
    
    /*
    * @oaram  guess Takes in user's guess
    */

    public static void playGame(NumberGuesser guess) {
        char userReponse = 'a';

        System.out.printf("Guess a number between %s and %s.\n",guess.lowerBound,guess.upperBound);
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
    * @param  guess    Integer value
    * @return response Return respone from user
    */
    public static char getUserReponseToGuess(int guess) {
        System.out.printf("Is it %d? (h/l/c): ", guess);
        char response = userInput().next().charAt(0); 
        return response;
    }


    /*
    * @return input Creates Scanner object
    */
    public static Scanner userInput() {
        Scanner input = new Scanner(System.in);
        return input;
    }


    /*
    * @return shouldPlay Will either play or close session 
    */
    public static boolean shouldPlayAgain() {
        System.out.print("Do you want to play again? (y/n): ");
        char playAgain = userInput().next().charAt(0);
        boolean shouldPlay = false;

        if (playAgain == 'y' || playAgain == 'Y') {
            shouldPlay = true;
        }

        return shouldPlay;
    }


    public static void main(String[] args) {
        do {
            NumberGuesser rng = new RandomNumberGuesser(1, 100);
            playGame(rng);
            rng.reset();
        } while (shouldPlayAgain());
        System.out.println("Good bye.");

    }
}