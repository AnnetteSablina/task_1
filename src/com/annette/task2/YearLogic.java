package com.annette.task2;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;

public class YearLogic {
    public static final int repetitionLeapYear = 4;
    public static final int century = 100;
    public static final int fourHundredYears = 100;


    public static int enterYear() {
        while (true){
            try {
                return EnterValue.enterValue("Enter the year", Mode.POSITIVE);
            }
            catch(NegativeException | ZeroException e){
                System.out.println(e.getMessage());
            }

        }

    }

    public static boolean isLeap(int year) {
        boolean isLeap = false;
        if (year % repetitionLeapYear == 0 && year % century != 0) {
            isLeap = true;
        } else if (year % fourHundredYears == 0) {
            isLeap = true;
        }
        return isLeap;
    }

}
