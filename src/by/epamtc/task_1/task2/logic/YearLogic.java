package by.epamtc.task_1.task2.logic;


public class YearLogic {
    public static final int repetitionLeapYear = 4;
    public static final int century = 100;
    public static final int fourHundredYears = 100;


    public static boolean isLeap(int year) {
        boolean isLeap = false;
        if (year % repetitionLeapYear == 0 && year % century != 0) {
            isLeap = true;
        } else if (year % fourHundredYears == 0) {
            isLeap = true;
        }
        return isLeap;
    }

}
