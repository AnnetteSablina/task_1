package by.epamtc.task_1.task7.console;

import by.epamtc.task_1.task7.enums.CoordinateType;
import by.epamtc.task_1.task7.entity.Point;
import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

public class InputFromConsole {
    public static Point fillPointCoordinates() {
        int xCoordinate = InputFromConsole.enterCoordinate(CoordinateType.X);
        int yCoordinate = InputFromConsole.enterCoordinate(CoordinateType.Y);
        return new Point(xCoordinate, yCoordinate);
    }
    public static int enterCoordinate(CoordinateType coordinateType) {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the "+ coordinateType.name().toLowerCase()
                        +" coordinate", Mode.ANY);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
