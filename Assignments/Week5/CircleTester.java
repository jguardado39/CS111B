package Assignments.Week5;
// import java.util.Scanner;

/*
*
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*
*/

public class CircleTester {
    
    public static Circle[] initiateCircle(int x[], int y[], double r[]) {
        Circle c[] = new Circle[3];

        for (int i = 0; i < x.length; i++) {
            Circle m = new Circle();
            m.setX(x[i]);
            m.setY(y[i]);
            m.setRadius(r[i]);
            c[i] = m;
        }
        return c;
    }

    public static void displayArea(Circle c[]) {
        for (int i = 0; i < c.length; i++) {
            System.out.printf("Circle %d area: %f\n",i + 1 ,c[i].getArea());
        }
    }

    public static void displayIfIntersect(Circle c[]) {
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                System.out.printf("Circle %d overlaps Circle %d: %B\n", i + 1, j + 1, c[i].doesOverlap(c[j]));
            }
            
        }
    }
    
    
    public static void main(String[] args) {
        Circle c[] = new Circle[3];
        int x[] = {10, 2, 3};
        // System.out.println(x.length);
        int y[] = {40, 5, 6};
        double radius[] = {7, 8, 29};

        c = initiateCircle(x, y, radius);
        displayArea(c);
        System.out.println();
        displayIfIntersect(c);

    }
}
