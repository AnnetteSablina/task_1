package by.epamtc.task_1.task4;


import by.epamtc.task_1.task4.console.InputFromConsole;
import by.epamtc.task_1.task4.logic.NumberLogic;

public class Runner {
    public static void main(String... args) {
        int firstValue = InputFromConsole.enterInt();
        int secondValue = InputFromConsole.enterInt();
        int thirdValue = InputFromConsole.enterInt();
        int forthValue = InputFromConsole.enterInt();
        System.out.println(NumberLogic.isTwoParityValues(firstValue, secondValue, thirdValue, forthValue));
    }
}
