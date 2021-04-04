package com.annette.task9;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;

import java.util.Objects;

public class Circle {

    private int radius;

    Circle() {
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle radius=" + radius ;
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
