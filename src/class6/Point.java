/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

/**
 *
 * @author shahzad
 */
public class Point {

    // Attribute / Field / Variables
    double x;
    double y;

//    Overloading = Same Return Type, Same MethodName, Different Prarameters
    // Special Method with Same method name as of Class Name
    // Default Constructor / Empty Argument Constructor
    Point() {
//        x = 0.0;
//        y = 0.0;
        this(0.0, 0.0);
    }

    // Argument Constructor / Copy Constructor
    // Nucleaus
    Point(double newX, double newY) {
//        x = newX;
//        y = newY;
        this.setX(newX);
        this.setY(newY);
    }

    // Clone Constructor / Copy Constructor
    Point(final Point p) {
//        x = p.x;
//        y = p.y;
        this(p.x, p.y);
    }

    // Method / Function / Property
    // What is x value ;
//    [return type] [methodname] ( [parameter list], ) {
//    [return type] variable ;
//    }
    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double distance(final Point p) {
        return Math.sqrt(((p.y - this.y) * (p.y - this.y))
                + ((p.x - this.x) * (p.x - this.x)));
    }

    // Move a point
    void move(double xDelta, double yDelta) {
    // Parameter values are increments to the current coordinates
        x += xDelta;
        y += yDelta;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        Point p = new Point(); // create new object
        Point p1 = new Point(5.0, 8.0);
        Point p2 = new Point(p1);
//        p.x = 10;
//        p.y = 10;

        System.out.println("x:" + p1.x);
        System.out.println("y:" + p1.y);

        System.out.println(p.distance(p1));

        System.out.println(p);
    }
}
