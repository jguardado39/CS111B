package Assignments.Week7;

/*
*
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*
*/

public class Circle {
    private Point center;
    private double radius;

    /*
    * @param o uses the class Point
    * @param r radius of the circle
    */
    public Circle (Point o, double r) {
        center = o;
        radius = r;
    }


    /*
    * @param xValue value of x
    * @param yValue value of y
    * @param r      radius of the circle
    */
    public Circle(double xValue, double yValue, double r) {
        center = new Point(xValue, yValue);
        radius = r;
    }


    public Circle() {
        center = new Point(0.0, 0.0);
        this.radius = 1;
    } 


    /*
    * @param c Circle class
    */
    public Circle(Circle c) {
        center = c.getCenter();
        radius = c.getRadius();
    }

    /*
    * @return center returns center of circle
    */
    public Point getCenter() {
        return center;
    }


    /*
    * @param  p Point class
    */
    public void setCenter(Point p) {
        this.center = p;
    }


    /*
    * @param value x-value
    */
    public void setX(double value) {
        this.center.setX(value);
    }

    /*
    * @return center.getX() x-value
    */
    public double getX() {
        return center.getX();
    }


    /*
    * @param value y-value
    */
    public void setY(double value) {
        this.center.setY(value);
    }


    /*
    * @return center.getY() y-value
    */
    public double getY() {
        return center.getY();
    }


    /*
    * @param value radius of circle
    */
    public void setRadius(double value) {
        this.radius = value;
    }


    /*
    * @return radius return radius of the circle
    */
    public double getRadius() {
        return radius;
    }


    /*
    * @return give area of circle
    */
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }


    /*
    * @return str string of X,Y,Radius
    */
    public String toString() {
        String str = "X: " + center.getX() + 
                     "\nY: " + center.getY() + 
                     "\nR: " + radius;
        return str;
    }


    /*
    * @return returns if centers are equal
    */
    public boolean equals(Circle c) {
        return center.equals(c.getCenter());
    }
    
    
    /*
    * This method will identify if the two circles in particluar
    * are overlapping
    *
    * @param  c            uses the class Circle 
    * @return              Will return if circles overlap
    */
    public boolean doesOverlap(Circle c) {
        return center.equals(c.getCenter());
    }
}
