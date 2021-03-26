package com.annette.Task7;

public class Runner {
    public static void main(String... args) {
        Point point1 = new Point(EnterCoordinate.enterCoordinate(CoordinateType.X),
                EnterCoordinate.enterCoordinate(CoordinateType.Y));
        Point point2 = new Point(EnterCoordinate.enterCoordinate(CoordinateType.X),
                EnterCoordinate.enterCoordinate(CoordinateType.Y));
        Point.compareDestinations(point1, point2);
    }
}
