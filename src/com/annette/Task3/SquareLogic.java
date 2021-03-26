package com.annette.Task3;

import com.annette.Utilities.EnterValue;
import com.annette.Utilities.Mode;
import com.annette.Utilities.NegativeException;

public class SquareLogic {
    public static int enterSquareSide() {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the value of square side", Mode.POSITIVE);
            } catch (NegativeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int countSquare(int squareSide) {
        return (int) Math.pow(squareSide, 2);
    }

    public static int countInscribedSquare(int square) {
        return square / 2;
    }
}
