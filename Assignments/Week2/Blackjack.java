package Assignments.Week2;
import java.util.*;

public class Blackjack {
    public static void main(String[] args) {
        Random random  = new Random();
        // int firstCard  = random.nextInt(10) +1;
        // int secondCard = random.nextInt(10) +1;
        // int totalAmount = firstCard + secondCard;
        Scanner input = new Scanner(System.in);
        char anotherCard ='y';
        char playAgain = 'y';
        
        while (playAgain != 'n' && playAgain != 'N') {
            int firstCard  = random.nextInt(10) +1;
            int secondCard = random.nextInt(10) +1;
            int totalAmount = firstCard + secondCard;
            System.out.printf("First cards: %d , %d\n", firstCard, secondCard);
            System.out.printf("Total: %d\n", totalAmount);
    
            while (anotherCard != 'n' && anotherCard != 'N') {
                System.out.print("Do you want another card? (y/n): ");
                anotherCard = input.next().charAt(0);
                // System.out.println();
                // System.out.printf("You entered: %s" , anotherCard);
                if (anotherCard == 'y' || anotherCard == 'Y') {
                    System.out.printf("Total: %d\n", totalAmount);
                }
            }
    
                System.out.printf("Would you like to play again? (y/n): ");
                playAgain = input.next().charAt(0);

                if  (playAgain == 'Y' || playAgain =='y')
                {
                    anotherCard = 'y';
                }
        }   
    }
}