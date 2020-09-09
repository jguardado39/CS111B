package Assignments.Week2;
import java.util.*;

/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class Blackjack {
    public static void main(String[] args) {
        // Seeding both random and input for this class
        Random random  = new Random();
        Scanner input = new Scanner(System.in);

        char anotherCard ='y';
        char playAgain = 'y';
        
        // Will loop if user wants to play again <> 'n' or 'N'
        while (playAgain != 'n' && playAgain != 'N') {
            // Random number(s) created firstCard, secondCard
            int firstCard  = random.nextInt(10) +1;
            int secondCard = random.nextInt(10) +1;
            int totalAmount = firstCard + secondCard;

            // Will print out cards for user & total amount
            System.out.printf("First cards: %d , %d\n", firstCard, secondCard);
            System.out.printf("Total: %d\n", totalAmount);
    
            // Will loop if user wants another card OR if total < 22
            while (anotherCard != 'n' && anotherCard != 'N') {
                System.out.print("Do you want another card? (y/n): ");
                anotherCard = input.next().charAt(0);

                // IF user wants another card, create another card & total
                if (anotherCard == 'y' || anotherCard == 'Y') {
                    int nextCard = random.nextInt(10) + 1;
                    System.out.printf("Card: %d\n", nextCard);
                    totalAmount += nextCard;
                    System.out.printf("Total: %d\n", totalAmount);
                    
                    // IF user is over 21 then print out "Bust."
                    if (totalAmount > 21) {
                        System.out.println("Bust.");
                        break;
                    }
                }
            }

                // IF users wants to play again then will replay loop from line 21
                System.out.printf("Would you like to play again? (y/n): ");
                playAgain = input.next().charAt(0);

                if  (playAgain == 'Y' || playAgain =='y')
                {
                    anotherCard = 'y';
                }
        }   
    }
}