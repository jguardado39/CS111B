package Readings.Chapter2;
import java.util.Scanner;

public class CookieCalorieCounter {
    public static void main(String[] args) {
        int SERVINGS = 300/(40 /10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cookies eaten: ");
        int cookies = sc.nextInt();

        System.out.println("Your calorie intake was: " + (cookies * SERVINGS) + " calories.");
    }   
}