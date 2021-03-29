package com.annette.task9;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;

public class Circle {

    private int radius;

    Circle() {
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public static Circle fromUserInput() {
        int radius;
        while (true) {
            try {
                radius = EnterValue.enterValue("Enter the radius", Mode.POSITIVE_NOT_NULL);
                return new Circle(radius);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
