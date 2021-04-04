package com.annette.task4;


public class NumberLogic {
    public static boolean isTwoParityValues(Value value) {
        return (value.getFirstValue() & 1) + (value.getSecondValue() & 1) + (value.getThirdValue() & 1)
                + (value.getForthValue() & 1) < 3;
    }
}
