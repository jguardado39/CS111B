package Assignments.Week5;
import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Circle c[] = new Circle[3];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < c.length; i++) {
            System.out.printf("Enter circle %d radius: ",i+1);
            double radius = scan.nextDouble();
            System.out.printf("Enter circle %d x and y co-ordinates: ",i+1);
            int x = scan.nextInt();
            int y = scan.nextInt();
            Circle m = new Circle();
            m.setX(x);
            m.setY(y);
            m.setRadius(radius);
            c[i] = m;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.printf("Circle %d area: %f\n",i+1, c[i].getArea());
            
        }
    }
}
