package Assignments.Week3;
import java.util.*;

/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class NumberGuesser {

    /*
    * This initiates the game
    */
    public static void playOneGame() {
        int guessMin = 1, guessMax = 100, midpoint;
        char userReponse = 'a';
        System.out.println("Guess a number between 1 and 100.");

        // Will loop as long as midpoint is not correct
        do {
            midpoint = getMidpoint(guessMin, guessMax);
            userReponse = getUserReponseToGuess(midpoint);

            if (userReponse == 'h' || userReponse == 'H') {
                guessMin = midpoint;
            } else {
                guessMax = midpoint;
            }
        } while (userReponse != 'c' && userReponse != 'C');
    }


    /*
    * This will get users response for if the guess is
    * higher (h), lower (l), or correct (c)
    */
    public static char getUserReponseToGuess(int guess) {
        System.out.printf("Is it %d? (h/l/c): ",guess);
        char response = userInput().next().charAt(0); 
        return response;
    }


    /*
    * Using Binary Search Algorithm in order to find
    * midpoint (x + y) / 2 and if (x + y) % 2 == 1 
    * then it will round down
    */
    public static int getMidpoint(int low, int high) {
        return (low + high) / 2;
    }


    /*
    * This will get all input(s) from user
    * This will be called in multiple method(s)
    */
    public static Scanner userInput() {
        Scanner input = new Scanner(System.in);
        // System.out.print("");
        return input;
    }
    

    /*
    * This will ask user if they want to play again
    */
    public static boolean shouldPlayAgain() {
        System.out.print("Great! Do you want to play again? (y/n): ");
        char playAgain = userInput().next().charAt(0);

        if (playAgain == 'y' || playAgain == 'Y') {
            return true;
        }

        return false;
    }
    

    public static void main(String[] args) {
        do {
            playOneGame();
        } while (shouldPlayAgain());
    }
}
