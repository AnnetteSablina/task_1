package com.annette.Task5;

import com.annette.Utilities.EnterValue;
import com.annette.Utilities.Mode;
import com.annette.Utilities.NegativeException;

public class EnterNumber {
    public static int enterNumber() {
    while (true){
        try{
            return EnterValue.enterValue ("Enter value", Mode.POSITIVE);
        }catch(NegativeException e) {
            System.out.println(e.getMessage());
        }

    }
    }
}
