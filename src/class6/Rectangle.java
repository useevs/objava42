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
public class Rectangle {

    Line width, height;

    public Rectangle() {
    }

    public Rectangle(Point s1, Point s2, Point s3, Point s4) {
        this(new Line(s1, s2), new Line(s3, s4));
    }

    public Rectangle(Line width, Line height) {
        this.width = new Line(width);
        this.height = new Line(height);
    }

    Rectangle(final Rectangle rec) {
        this(rec.width, rec.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

    public double area() {
        return width.length() * height.length();
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec);
    }
}
