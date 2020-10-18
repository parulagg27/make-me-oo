package org.oop;

public class Point{
    private double x;
    private double y;

    private double xDistance (Point finalPoint) {
        return (finalPoint.x - this.x);
    }

    private double yDistance (Point finalPoint) {
        return (finalPoint.y - this.y);
    }

    public Point(double xCoordinate, double yCoordinate) {
        this.x = xCoordinate;
        this.y = yCoordinate;
    }

    public double distance(Point finalPoint) {
        return Math.sqrt(Math.pow(this.xDistance(finalPoint), 2) + Math.pow(this.yDistance(finalPoint), 2));
    }

    public double direction(Point finalPoint) {
        return Math.atan2(this.yDistance(finalPoint), this.xDistance(finalPoint));
    }
}
