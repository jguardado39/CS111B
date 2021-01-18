package Assignments.FinalExam;
import java.util.Scanner;

public class FlyingCar extends Car {
    protected double altitude;

    public FlyingCar(double s, Location l, double a) {
        super(s,l);
        altitude = a;
    }

    public FlyingCar(double a) {
        super();
        altitude = a;
    }

    public void getters() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter altitude:");
        altitude = input.nextDouble();

    }

    public void land() {
        stop();
        altitude = 0;
    }

    public boolean isHigherAndFaster(FlyingCar fc) {
        boolean altitudeAndSpeedGreater = false;

        if (this.altitude < fc.altitude && this.speed < fc.speed) {
            altitudeAndSpeedGreater = true;
        }

        return altitudeAndSpeedGreater;
    }
}