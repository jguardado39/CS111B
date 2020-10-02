package Assignments.Week5;

/*
*
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*
*/

public class Circle {
    // field required
    private double radius;
    private double x;
    private double y;

    
    public void setX(double value) {
        x = value;
    }

    public double getX() {
        return x;
    }

    public void setY(double value) {
        y = value;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double value) {
        radius = value;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public boolean doesOverlap(Circle otherCircle) {
        double distance = Math.pow(Math.pow((x - otherCircle.x),2) + Math.pow((y - otherCircle.y), 2), 0.5);
        double sumOfRadii = radius + otherCircle.radius;

        if (distance > sumOfRadii) {
            return false;
        }
        return true;
    }
}
