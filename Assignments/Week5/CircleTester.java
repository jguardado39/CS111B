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
    /*
    *
    * Method: initiate Circle
    * Input: int[] x 2, double[]
    * Output: Circle[]
    * 
    * Will go throught the x, y, and radius arrays to create Circle classes 
    * or whatever and loop it into a Circle Array
    *
    */
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


    /*
    *
    * Method: displayArea
    * Input: Circle[]
    * Output: none
    * 
    * Will display the area by calling the
    * class Circle and method getArea
    *
    */
    public static void displayArea(Circle c[]) {
        for (int i = 0; i < c.length; i++) {
            System.out.printf("Circle %d area: %f\n",i + 1 ,c[i].getArea());
        }
    }


    /*
    *
    * Method: displayIfIntersect
    * Input: Circle[]
    * Output: none
    * 
    * this does a nested for loop where it checks if the circles overlap so which
    * uses class Circle as well as the method doesOverlap
    *
    */
    public static void displayIfIntersect(Circle c[]) {
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                System.out.printf("Circle %d overlaps Circle %d: %B\n", i + 1, j + 1, c[i].doesOverlap(c[j]));
            }
            
        }
    }
    
    
    public static void main(String[] args) {
        // Fields required to intiate
        Circle c[] = new Circle[3];
        int x[] = {10, 2, 3};
        int y[] = {40, 5, 6};
        double radius[] = {7, 8, 29};

        c = initiateCircle(x, y, radius); // Will intiate and go to class Circle
        displayArea(c);           // Will display Area of c[]
        System.out.println();    // Line break for astetic
        displayIfIntersect(c);  // Will display if circles intersect

    }
}
