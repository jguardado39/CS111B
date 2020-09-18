package Assignments.Week3;
import java.util.*;

/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class NumberGuesser {

    public static void playOneGame() {
        int guessMin = 1, guessMax = 100, midpoint;
        char userReponse = 'a';
        System.out.println("Guess a number between 1 and 100.");

        do {
            midpoint = getMidpoint(guessMin, guessMax);
            
            char userResponse = getUserReponseToGuess(midpoint);
            
            if (userResponse == 'h' || userResponse == 'H') {
                guessMin = midpoint;
            } else {
                guessMax = midpoint;
            }

        } while (userReponse != 'c' && userReponse != 'C');

    }

    public static char getUserReponseToGuess(int guess) {
        System.out.printf("Is it %d? (h/l/c): ",guess);
        char response = userInput().next().charAt(0); 
        return response;
    }

    public static int getMidpoint(int low, int high) {
        return (low + high) / 2;
    }

    public static Scanner userInput() {
        Scanner input = new Scanner(System.in);
        // System.out.print("");
        return input;
    }
    
    public static boolean shouldPlayAgain() {
        // char playAgain;
        // Scanner input = new Scanner(System.in);
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
