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
public class Line {

    //    double x1, x2, y1, y2;
    Point start, end;

    // Default Constructor
    Line() {

    }

    // Argument Constructor
    Line(double x1, double y1, double x2, double y2) {
//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    // Clone Constructor
    Line(final Line line) {
        this(line.start, line.end);
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + '}';
    }

    double length() {
        return start.distance(end);
    }

    // Return a point as the intersection of two lines
    Point intersects(final Line line1) {
        Point localPoint = new Point(0, 0);
        double num = (end.y - start.y) * (start.x - line1.start.x)
                - (end.x - start.x) * (start.y - line1.start.y);
        double denom = (end.y - start.y) * (line1.end.x - line1.start.x)
                - (end.x - start.x) * (line1.end.y - line1.start.y);
        localPoint.x = line1.start.x + (line1.end.x - line1.start.x) * num / denom;
        localPoint.y = line1.start.y + (line1.end.y - line1.start.y) * num / denom;
        return localPoint;
    }

    public static void main(String[] args) {
        Line line = new Line(0, 0, 20, 20);
        System.out.println(line);
    }
}
