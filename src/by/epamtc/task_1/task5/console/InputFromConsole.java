package by.epamtc.task_1.task5.console;

import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

public class InputFromConsole {
    public static int enterNumber() {
        while (true) {
            try {
                return EnterValue.enterValue("Enter value", Mode.POSITIVE);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
