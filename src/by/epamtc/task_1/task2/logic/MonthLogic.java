package by.epamtc.task_1.task2.logic;


import by.epamtc.task_1.task2.exception.MonthException;

public class MonthLogic {

     public static void checkMonth(int month) throws MonthException {
         if (month < 0 || month > 12 ) throw new MonthException("Incorrect month value");
     }

}
