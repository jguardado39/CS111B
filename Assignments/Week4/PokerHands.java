package Assignments.Week4;
// import java.util.Arrays; 


public class PokerHands {

    public static void displayCards (int hand[]) {
        for (int i = 0; i < hand.length; i++) {
            System.out.printf("Card %d: %d\n", i + 1, hand[i]);
        }
    }


    public static boolean containsPair(int hand[]){
        int count = 0;
        for (int i = 0; i < hand.length; i++ ){
            
            for (int j = 0; j < hand.length; j++) {
                if (hand[i] == hand[j]) {
                    count += 1;
                }
            }

            if (count == 2){
                return true;
            } else {
                count = 0;
            }

        }
        return false;
    }

    // public static boolean  containsTwoPair(int hand[]) {
    //     int [] repeat = new int[3];

    // }
    
    public static boolean  containsThreeOfaKind(int hand[]) {
        int count = 0;
        for (int i = 0; i < hand.length; i++ ){
            
            for (int j = 0; j < hand.length; j++) {
                if (hand[i] == hand[j]) {
                    count += 1;
                }
            }

            if (count == 3){
                return true;
            } else {
                count = 0;
            }

        }
        return false;
    }
    
    // public static boolean  containsStraight(int hand[])
    
    public static boolean  containsFullHouse(int hand[]) {
        if (containsThreeOfaKind(hand) && containsPair(hand)) {
            return true;
        }
        return false;
    }
    
    public static boolean  containsFourOfaKind(int hand[]) {
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
        int[] hand = {3,4,5,2,1};

        displayCards(hand);

        int[] test = new int[3];
        System.out.printf("Size of array: %d", test.length);
        
        if (containsFourOfaKind(hand)) {
            System.out.println("Four of a Kind!");
        } else if (containsFullHouse(hand)) {
            System.out.println("Full House!");
        } else if (containsThreeOfaKind(hand)) {
            System.out.println("Three of a Kind!");
        } else if (containsPair(hand)) {
            System.out.println("Pairs!");
        } else {
            System.out.println("High Card!");
        }
    }
}
