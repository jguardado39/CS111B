package Assignments.Week12.NumberGuessers;
import java.util.*;

public class GuessingGame {
	public static void main(String[] args) {
		NumberGuesser g = new RandomNumberGuesser(1, 100);
		char response;
	
		do {
			g.reset();
			System.out.println("Think of a number from 1 to 100.");
			
			try {
				do {
					response = promptUserAndGetResponse(g.getCurrentGuess());
					
					if (response == 'h') g.higher();
					if (response == 'l') g.lower();
					
				} while (response != 'c');
			}
			
			catch (IllegalStateException e) {
				System.out.println(e.getMessage());
			}
			
		} while (shouldPlayAgain());
	}
	
	/**
	* Helper Methods
	**/
	

	public static char promptUserAndGetResponse(int guess) {
		char response = 'a';
		Scanner input = new Scanner(System.in);
		
		do {
			try {
				System.out.print("Is it " + guess + "? (h/l/c): ");
				response = input.next().charAt(0);
			} catch (IllegalStateException e) {
				System.out.println("Invalid input, You are cheating!");
			}
		} while (response != 'h' && response != 'l' && response != 'c');
		
		return response;
	}
	  

	public static boolean shouldPlayAgain() {
		char response;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Do you want to play again? (y/n): ");
			response = input.next().charAt(0);
		} while (response != 'y' && response != 'n');
		
		return response == 'y';
	}
}