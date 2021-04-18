package by.epamtc.task_1.task1;

public class NumberLogic {

    public static int getLastSquareNumber(int number) {
        number = Math.abs(number);
        return switch (number % 10) {
            case 2, 8 -> 4;
            case 3, 7 -> 9;
            case 4 -> 6;
            case 9 -> 1;
            default -> number;
        };
    }

}
