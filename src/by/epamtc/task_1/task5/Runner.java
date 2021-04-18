package by.epamtc.task_1.task5;

import by.epamtc.task_1.task5.console.InputFromConsole;
import by.epamtc.task_1.task5.logic.CheckPerfection;

public class Runner {
    public static void main (String...args) {
     int number = InputFromConsole.enterNumber();
      System.out.println(CheckPerfection.checkNumberPerfection(number));
    }
}
