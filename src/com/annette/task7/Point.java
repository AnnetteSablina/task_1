package com.annette.task7;

import java.util.Objects;

public class Point {
    private int x;
    private int y;


    Point() {}

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static Point fillPointCoordinates() {
        int xCoordinate = EnterCoordinate.enterCoordinate(CoordinateType.X);
        int yCoordinate = EnterCoordinate.enterCoordinate(CoordinateType.Y);
        return new Point(xCoordinate, yCoordinate);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
