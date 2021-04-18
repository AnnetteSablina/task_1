package by.epamtc.task_1.task9.console;

import by.epamtc.task_1.task9.entity.Circle;
import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

public class InputFromConsole {
    public static Circle enterCircleFields() {
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
