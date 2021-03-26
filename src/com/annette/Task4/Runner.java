package com.annette.Task4;


import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;

public class Runner {
    public static void main (String ... args) throws NegativeException {
        int firstValue = EnterValue.enterValue("Enter the first value", Mode.ANY);
        int secondValue = EnterValue.enterValue("Enter the second value", Mode.ANY);
        int thirdValue = EnterValue.enterValue("Enter the third value", Mode.ANY);
        int forthValue = EnterValue.enterValue("Enter the forth value", Mode.ANY);
    System.out.println(NumbersLogic.parityCheck(firstValue,secondValue,thirdValue,forthValue));

   }
}
