package com.annette.task7;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double countDestination() {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public static void compareDestinations(Point point1, Point point2) {
        if (point1.countDestination() < point2.countDestination()) System.out.println("The first point is closer");
        else if (point1.countDestination() == point2.countDestination() && point1.x == point2.x)
            System.out.println("This is the same point");
        else if (point1.countDestination() == point2.countDestination())
            System.out.println("Destination is the same");
        else System.out.println("The second point is closer");
    }
}
