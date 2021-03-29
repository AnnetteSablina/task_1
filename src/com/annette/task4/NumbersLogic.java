package com.annette.task4;


public class NumbersLogic {
    public static boolean parityCheck(Number number) {
        return (number.getFirstValue() & 1) + (number.getSecondValue() & 1) + (number.getThirdValue() & 1)
                + (number.getForthValue() & 1) < 3;
    }

}
