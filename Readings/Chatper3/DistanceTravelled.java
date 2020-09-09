package Readings.Chatper3;
import java.util.Scanner;

public class DistanceTravelled {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int time, speed;
        // double distance;

        System.out.print("Enter vehicle speed (in mph): ");
        speed = keyboard.nextInt();

        System.out.print("Enter time travelled (in hrs): ");
        time = keyboard.nextInt();
        // System.out.println();

        System.out.println(" Hour Distance");
        System.out.println("--------------------------");

        for (int hour = 1; hour < time + 1; hour++) {
            System.out.println(hour + "  " + (hour * speed));
        }
    }
}