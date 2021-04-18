package by.epamtc.task_1.task6.console;

import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

public class EnterSecondNumber {
    public static int enterSeconds() {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the quantity of seconds", Mode.POSITIVE);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
