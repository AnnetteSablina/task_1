package com.annette.Task4;


import com.annette.Utilities.EnterValue;
import com.annette.Utilities.Mode;
import com.annette.Utilities.NegativeException;

public class Runner {
    public static void main (String ... args) throws NegativeException {
        int firstValue = EnterValue.enterValue("Enter the first value", Mode.ANY);
        int secondValue = EnterValue.enterValue("Enter the second value", Mode.ANY);
        int thirdValue = EnterValue.enterValue("Enter the third value", Mode.ANY);
        int forthValue = EnterValue.enterValue("Enter the forth value", Mode.ANY);
    System.out.println(NumbersLogic.parityCheck(firstValue,secondValue,thirdValue,forthValue));

   }
}
