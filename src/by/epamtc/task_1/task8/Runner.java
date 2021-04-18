package by.epamtc.task_1.task8;

import by.epamtc.task_1.task8.console.InputVariableFromConsole;
import by.epamtc.task_1.task8.logic.SolveEquation;

public class Runner {
    public static void main (String...args){
        System.out.println("Result is " + SolveEquation.solveEquation(InputVariableFromConsole.EnterValue()));
    }
}
