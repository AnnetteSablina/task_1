package com.annette.task5;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;

public class EnterNumber {
    public static int enterNumber() {
    while (true){
        try{
            return EnterValue.enterValue ("Enter value", Mode.POSITIVE);
        }catch(NegativeException | ZeroException e) {
            System.out.println(e.getMessage());
        }

    }
    }
}
