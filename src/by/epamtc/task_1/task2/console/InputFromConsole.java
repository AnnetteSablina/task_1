package by.epamtc.task_1.task2.console;

import by.epamtc.task_1.task2.entity.Date;
import by.epamtc.task_1.task2.exception.MonthException;
import by.epamtc.task_1.task2.logic.DateService;
import by.epamtc.task_1.task2.logic.MonthLogic;
import by.epamtc.task_1.task2.logic.YearLogic;
import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

public class InputFromConsole {
    public static Date fillClassFields() {
        while (true) {
            int year = InputFromConsole.enterYear();
            int month = InputFromConsole.enterMonth();
            int day = 0;
            try {
                day = DateService.countNumberOfDays(YearLogic.isLeap(year), month);
                return new Date(year, month, day);
            } catch (MonthException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public static int enterYear() {
        while (true){
            try {
                return EnterValue.enterValue("Enter the year", Mode.POSITIVE);
            }
            catch(NegativeException | ZeroException e){
                System.out.println(e.getMessage());
            }

        }

    }
    public static int enterMonth() {
        while(true){
            try {
                int month = EnterValue.enterValue("Enter the month", Mode.POSITIVE);
                MonthLogic.checkMonth(month);
                return month;
            } catch (MonthException | NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
