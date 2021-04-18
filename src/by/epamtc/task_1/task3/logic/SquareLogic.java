package by.epamtc.task_1.task3.logic;


public class SquareLogic {

    public static int countSquare(int squareSide) {
        return (int) Math.pow(squareSide, 2);
    }
    
    public static int countInscribedSquare(int square) {
        return square / 2;
    }
}
