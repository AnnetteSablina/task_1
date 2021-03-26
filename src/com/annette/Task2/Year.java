package com.annette.Task2;

import com.annette.Utilities.EnterValue;
import com.annette.Utilities.Mode;
import com.annette.Utilities.NegativeException;

public class Year {
    public static int enterYear() {
        while (true){
            try {
                return EnterValue.enterValue("Enter the year", Mode.POSITIVE);
            }
            catch(NegativeException e){
                System.out.println(e.getMessage());
            }

        }

    }

    public static boolean isLeap(int year) {
        boolean isLeap = false;
        if (year % 4 == 0 && year % 100 != 0) {
            isLeap = true;
        } else if (year % 400 == 0) {
            isLeap = true;
        }
        return isLeap;
    }


}
