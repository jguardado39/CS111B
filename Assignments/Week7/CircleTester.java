package Assignments.Week7;

/*
*
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*
*/

public class CircleTester {
    public static void main(String[] args) {
        Circle c   = new Circle(1.0, 2.0, 3.0);
        Point  p   = new Point(1.0, 2.0);
        Circle c_1 = new Circle(p, 3.0);
        
        System.out.printf("Does c and c_1 equal: %b\n", c.equals(c_1));

        Circle c_2 = new Circle();
        Circle c_3 = new Circle(c_1);

        System.out.printf("Does c and c_2 equal: %b\n", c.equals(c_2));
        
        System.out.println();
        System.out.println(c_2.toString());
        System.out.println();

        System.out.printf("Does c_3 and c_1 equal: %b\n",c_3.equals(c_1));
        System.out.printf("Does c_3 and c_1 overlap: %b\n",c_3.doesOverlap(c_1));
     }
}
