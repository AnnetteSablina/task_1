package by.epamtc.task_1.task9;

import by.epamtc.task_1.task9.console.InputFromConsole;
import by.epamtc.task_1.task9.entity.Circle;

public class Runner {
    public static void main (String... args){
        Circle circle = InputFromConsole.enterCircleFields();
        System.out.println("Length is " + circle.countCircleLength() +
                " Square is " + circle.countCircleSquare());
    }
}
