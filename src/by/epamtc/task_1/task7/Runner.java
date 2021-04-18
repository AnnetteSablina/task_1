package by.epamtc.task_1.task7;

import by.epamtc.task_1.task7.console.InputFromConsole;
import by.epamtc.task_1.task7.entity.Point;
import by.epamtc.task_1.task7.logic.PointLogic;
import by.epamtc.task_1.utility.NullException;

public class Runner {
    public static void main(String... args) {
       Point point1 = InputFromConsole.fillPointCoordinates();
       Point point2 = InputFromConsole.fillPointCoordinates();
        try {
            System.out.println(PointLogic.compareDestinations(point1,point2));
        } catch (NullException e) {
            e.printStackTrace();
        }
    }
}
