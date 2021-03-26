package com.annette.Task6;

import com.annette.Utilities.EnterValue;
import com.annette.Utilities.Mode;
import com.annette.Utilities.NegativeException;

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
