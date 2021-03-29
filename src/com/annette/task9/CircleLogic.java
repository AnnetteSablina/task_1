package com.annette.task9;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleLogic {
    public static double countCircleLength(Circle circle){
        return 2 * PI * circle.getRadius();
    }
    public static double countCircleSquare (Circle circle){
        return PI * pow(circle.getRadius(),2);
    }
}
