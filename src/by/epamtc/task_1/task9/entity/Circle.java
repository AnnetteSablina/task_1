package by.epamtc.task_1.task9.entity;

public class Circle {

    private int radius;

    public Circle() { }

    public Circle(int radius) {
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
        return radius * 31;
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius;
    }

    public double countCircleLength() {
        return 2 * Math.PI * radius;
    }

    public double countCircleSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

}
