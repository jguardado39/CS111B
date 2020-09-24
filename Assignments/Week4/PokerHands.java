package Assignments.Week4;
import java.util.Arrays;  // Just used to sort for one method
import java.util.Scanner; // Used to gather input for one method

/* 
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*/

public class PokerHands {

    /* 
    *
    * Input:  None
    * Output: int[]
    * 
    * Will get input from use and output the Card # and input from user
    *
    */
    public static int[] getCard() {
        // Required fields: Scanner & int[]
        int hand[] = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numeric cards, no face cards. Use 2-9");
        for (int i = 0; i < hand.length; i++) {
            System.out.printf("Card %d: ", i + 1);
            hand[i] = input.nextInt(); 
        }
        return hand;
    }


    /*
    *
    * Input:  int[]
    * Output: boolean
    *
    * This will check if hand has only ONE duplicate within
    * the array. This is using a nested for loop to do this
    *
    */
    public static boolean containsPair(int hand[]){
        // Required fields: count 
        int count = 0;

        // Cute nested for loop :)
        for (int i = 0; i < hand.length; i++ ){    
            for (int j = 0; j < hand.length; j++) {
                if (hand[i] == hand[j]) {
                    count += 1;
                }
            }
            if (count == 2){ // This will test if element is visible 2 times
                return true;
            } else {
                count = 0; // Reset count if FALSE
            }
        }
        return false; // If none have duplicates then FALSE
    }


    /*
    *
    * Input:  int[]
    * Output: boolean
    *
    * First check if there is a pair in the array. Since 
    * two pairs must at least have one pair. Then it will
    * check with a nested for loop. It is a bit complicated
    * but with the same logic as method containsPairs it checks
    * if there are 2 pairs with two nested loops
    *
    */
    public static boolean containsTwoPair(int hand[]) {
        if (containsPair(hand)) {
            // Required fields: firstPair, secondPair, count
            int firstPair = 0, secondPair = 0, count = 0;
            // Nested loop to find first pair
            for (int i = 0; i < hand.length; i++) {
                for (int j = 0; j < hand.length; j++) {
                    if (hand[i] == hand[j]) {
                        count += 1;
                    }
                }
                if (count == 2) { // If there is a pair
                    firstPair = hand[i]; // element assigned from firstPair
                    count = 0; // Reset count
                    break; // Breaks from nested loop
                }
                count = 0; // Reset count
            }
            // This is the second nested loop to find second pair same logic
            // as first nested loop
            for (int i = 0; i < hand.length; i++) {
                for (int j = 0; j < hand.length; j++) {
                    if (hand[i] == hand[j]) {
                        count += 1;
                    }
                }
                if (count == 2 && firstPair != hand[i]) { // Will make sure it is pair but not same pair
                    secondPair = hand[i]; // element assigned to secondPair
                    break; // Break from nested loop
                }
                count = 0; // Reset count
            }
            // Final test. To make sure we have two pairs
            // Since we set each int to 0 we want to verify that
            // they are not the same
            if (firstPair != 0 && secondPair != 0) {
                return true;
            }
        }
        return false; // FALSE if there are no pairs
    }
    

    /*
    *
    * Input:  int[]
    * Output: boolean
    *
    * Same logic as containsPairs but instead of count == 2 we
    * change it to count == 3
    *
    */
    public static boolean containsThreeOfaKind(int hand[]) {
        // Required field count
        int count = 0;
        // Nested for loop to check number of times element shows in hand
        for (int i = 0; i < hand.length; i++ ){
            for (int j = 0; j < hand.length; j++) {
                if (hand[i] == hand[j]) {
                    count += 1;
                }
            }
            if (count == 3){ // If element shows up 3 times
                return true; 
            } else {
                count = 0; // If does not Return FALSE
            }
        }
        return false; // FALSE if element does not show 3 times
    }
    

    /*
    *
    * Input: int[]
    * Output: boolean
    *
    * Uses Arrays.sort to first sort the int[] then we will check
    * to see if elmements adajecent to each other have a difference 
    * of 1
    *
    */
    public static boolean containsStraight(int hand[]) {
        // Will sort int[]
        Arrays.sort(hand);
        // First we need to check if they do not have a pair
        if (!(containsPair(hand))) {
            // Will check if adjacent elements have a difference of 1
            for (int i = 0; i < hand.length - 1; i++) {
                if ((hand[i] + 1) != hand[i + 1]) {
                    return false; // If not true return FALSE
                }
            }
            return true; // all works return TRUE
        }
        return false; // If has pairs return FALSE
    }
    

    /*
    *
    * Input: int[]
    * Output: boolean
    *
    * Since a full house is bacially a pair & a three of a kind then 
    * We just need to check if both statements are true
    * 
    */
    public static boolean containsFullHouse(int hand[]) {
        if (containsThreeOfaKind(hand) && containsPair(hand)) {
            return true;
        }
        return false;
    }
    

    /*
    *
    * Input:  int[]
    * Output: boolean
    *
    * Just like containsPairs you need to check if elements shows up
    * four times. 
    */
    public static boolean  containsFourOfaKind(int hand[]) {
        // Required fields first, second, count1, count2
        int first = hand[0], second = hand[1];
        int count1 = 0, count2 = 0;

        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == first) {
                count1 += 1;
            } else if (hand[i] == second) {
                count2 += 1;
            }
        }

        if (count1 == 4) {
            return true;
        } else if (count2 == 4) {
            return true;
        } else {
            return false;
        }
    }
    
    

    public static void main(String[] args) {
        int[] hand = getCard(); // Get Card

        // This will test all test until one passes.
        // They are by highest ranked because it would
        // cause more issues if they are in reverse
        
        if (containsFourOfaKind(hand)) {
            System.out.println("Four of a Kind!");
        } else if (containsFullHouse(hand)) {
            System.out.println("Full House!");
        } else if (containsStraight(hand)) {
            System.out.println("Straight!");
        } else if (containsThreeOfaKind(hand)) {
            System.out.println("Three of a Kind!");
        } else if (containsTwoPair(hand)) {
            System.out.println("Two Pairs!");
        } else if (containsPair(hand)) {
            System.out.println("Pairs!");
        } else {
            System.out.println("High Card!");
        }
    }
}
