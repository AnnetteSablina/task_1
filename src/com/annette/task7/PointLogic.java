package com.annette.task7;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointLogic {
    public static double countDestination(Point point) {
        return (sqrt(pow(point.getX(), 2) + pow(point.getY(), 2)));
    }

    public static CompareState compareDestinations(Point point1, Point point2) {
        if (countDestination(point1) < countDestination(point2)) return CompareState.FIRST_POINT_IS_CLOSER;
        else if (countDestination(point1) == countDestination(point2) && point1.getX() == point2.getX())
            return CompareState.SAME_POINT;
        else if (countDestination(point1) == countDestination(point2))
            return CompareState.DESTINATION_IS_THE_SAME;
        else return CompareState.SECOND_POINT_IS_CLOSER;
    }
    public static void printState (CompareState compareState){
        System.out.println(compareState.getState());
    }

}
