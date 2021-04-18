package by.epamtc.task_1.task7.logic;
import by.epamtc.task_1.task7.enums.CompareState;
import by.epamtc.task_1.task7.entity.Point;
import by.epamtc.task_1.utility.NullException;



public class PointLogic {

    private static double countDestination(Point point) throws NullException {
        if (point == null) throw new NullException();
        return (Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2)));
    }
    /*сделала реализацию, которая позволяет получить не только координаты точки, но и отношения между точками
    * То, что будет возвращать метод зависит от того, что хочет заказчик. Точки (2;1) и (1;2) равноудалены, какую
    * из них нужно заказчику? Я постаралась сделать универсально, если надо конкретно значения, то программист допишет
    * метод, которым он распарсит строку.*/
    public static String compareDestinations(Point point1, Point point2) throws NullException {
        if (countDestination(point1) < countDestination(point2))
            return CompareState.FIRST_POINT_IS_CLOSER + " " + point1;
        else if (countDestination(point1) == countDestination(point2) && point1.getX() == point2.getX())
            return CompareState.SAME_POINT + " " + point1;
        else if (countDestination(point1) == countDestination(point2))
            return CompareState.DESTINATION_IS_THE_SAME + " " + point1 + " " + point2;
        else return CompareState.SECOND_POINT_IS_CLOSER + " " +  point2;
    }
}
