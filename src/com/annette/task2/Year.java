package com.annette.task2;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;

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
