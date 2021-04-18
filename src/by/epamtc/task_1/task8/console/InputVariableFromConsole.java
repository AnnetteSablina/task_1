package by.epamtc.task_1.task8.console;

import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

public class InputVariableFromConsole {
    public static int EnterValue(){
        while (true) {
            try {
              return  EnterValue.enterValue("Enter the variable", Mode.ANY);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
