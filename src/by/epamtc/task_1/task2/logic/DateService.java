package by.epamtc.task_1.task2.logic;

import by.epamtc.task_1.task2.exception.MonthException;

public class DateService {
   public static int countNumberOfDays(boolean isLeap, int month) throws MonthException {
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new MonthException("Unexpected value: ");
        };
        if (month == 2 && isLeap) day = 29;
        return day;
    }
}
