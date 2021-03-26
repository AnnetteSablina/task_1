package com.annette.task6;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;

public class EnterSeconds {
    public static int enterSeconds() {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the quantity of seconds", Mode.POSITIVE);
            } catch (NegativeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
