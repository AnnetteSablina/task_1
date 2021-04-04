package com.annette.task9;



public class CircleLogic {
    public static double countCircleLength(Circle circle){
        return 2 * Math.PI * circle.getRadius();
    }
    public static double countCircleSquare (Circle circle){
        return Math.PI * Math.pow(circle.getRadius(),2);
    }
}
