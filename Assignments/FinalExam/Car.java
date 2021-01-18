package Assignments.FinalExam;
import java.util.Scanner;

public class Car {
    protected double speed;
    private Location loc;

    public Car() {
        speed = 0;
        loc = new Location(0.0,0.0);
    }

    public Car(double s, Location l) {
        speed = s;
        loc = l;
    }

    public Car (Location l) {
        Car c = new Car(this.speed,l);
    }

    public void getters() {
        Scanner input = new Scanner(System.in);
        double lat, lon;
        
        System.out.println("Enter speed: ");
        speed = input.nextDouble();

        System.out.println("Enter Location: ");
        lat = input.nextDouble();
        lon = input.nextDouble();

        loc = new Location(lat, lon);
    }

    public void stop() {
        speed = 0;
    }

}
