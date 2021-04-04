package com.annette.task3;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;


public class SquareLogic {
    public static int enterSquareSide() {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the value of square side", Mode.POSITIVE);
            } catch (NegativeException | ZeroException e) {
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
