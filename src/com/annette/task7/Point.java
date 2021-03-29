package com.annette.task7;

public class Point {
    private int x;
    private int y;


    Point() {
    }

    ;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static Point fromUserInput() {
        int xCoordinate = EnterCoordinate.enterCoordinate(CoordinateType.X);
        int yCoordinate = EnterCoordinate.enterCoordinate(CoordinateType.Y);
        return new Point(xCoordinate, yCoordinate);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
