package Assignments.Week2;
import java.util.*;

public class Blackjack {
    public static void main(String[] args) {
        Random random  = new Random();
        int firstCard  = random.nextInt(10) +1;
        int secondCard = random.nextInt(10) +1;
        int totalAmount = firstCard + secondCard;
        Scanner input = new Scanner(System.in);
        char anotherCard;

        System.out.printf("First cards: %d , %d\n", firstCard, secondCard);
        System.out.printf("Total: %d\n", totalAmount);
        System.out.print("Do you want another card? (y/n): ");
        anotherCard = input.next().charAt(0);
        System.out.printf("You entered: %s" , anotherCard);

        while (anotherCard != 'n' || anotherCard != 'N') {
            
        }


    }
}