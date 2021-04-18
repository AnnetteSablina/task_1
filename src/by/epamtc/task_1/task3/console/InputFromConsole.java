package by.epamtc.task_1.task3.console;

import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

public class InputFromConsole {
    public static int enterSquareSide() {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the value of square side", Mode.POSITIVE);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
