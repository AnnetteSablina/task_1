package by.epamtc.task_1.task3;

import by.epamtc.task_1.task3.console.InputFromConsole;
import by.epamtc.task_1.task3.logic.SquareLogic;

public class Runner {
    public static void main(String ... args){
      int squareSide = InputFromConsole.enterSquareSide();
      int square = SquareLogic.countSquare(squareSide);
      System.out.println ("Inscribed square is "+ SquareLogic.countInscribedSquare(square));
    }
}
