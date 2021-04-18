package by.epamtc.task_1.task6;

import by.epamtc.task_1.task6.console.EnterSecondNumber;
import by.epamtc.task_1.task6.logic.SecondsTransformation;

public class Runner {
    public static void main(String... args) {
        int seconds = EnterSecondNumber.enterSeconds();
        System.out.println("Hours: " + SecondsTransformation.countHours(seconds)
                + " Minutes: " + SecondsTransformation.countMinutes(seconds) +
                " Seconds:" + SecondsTransformation.countSeconds(seconds));
    }
}
