package com.annette.task4;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;

public class Number {
    private final int firstValue;
    private final int secondValue;
    private final int thirdValue;
    private final int forthValue;

    public Number (){
        firstValue = 0;
        secondValue = 0;
        thirdValue = 0;
        forthValue = 0;
    };

    public Number(int firstValue, int secondValue, int thirdValue, int forthValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.forthValue = forthValue;
    }

    public static Number fromUserInput(){
        while(true){
            try {
                int firstValue = EnterValue.enterValue("Enter the first value", Mode.ANY);
                int secondValue = EnterValue.enterValue("Enter the second value", Mode.ANY);
                int thirdValue = EnterValue.enterValue("Enter the third value", Mode.ANY);
                int forthValue = EnterValue.enterValue("Enter the forth value", Mode.ANY);
                return new Number(firstValue,secondValue,thirdValue,forthValue);
            } catch (NegativeException | ZeroException e) {
               System.out.println(e.getMessage());
            }

        }
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public int getThirdValue() {
        return thirdValue;
    }

    public int getForthValue() {
        return forthValue;
    }
}
