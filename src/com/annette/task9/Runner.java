package com.annette.task9;

public class Runner {
    public static void main (String... args){
        Circle circle = Circle.fromUserInput();
        System.out.println("Length is " + CircleLogic.countCircleLength(circle) +
                " Square is " + CircleLogic.countCircleSquare(circle));
    }
}
