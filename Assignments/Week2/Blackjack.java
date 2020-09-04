package Assignments.Week2;
import java.util.*;

public class Blackjack {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10) + 1;
            System.out.printf("Number %3d: %2d\n", i+1, number);
        }
    }
}