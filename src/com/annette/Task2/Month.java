package com.annette.Task2;

import com.annette.Utilities.EnterValue;
import com.annette.Utilities.Mode;
import com.annette.Utilities.NegativeException;

public class Month  {

     public static int enterMonth() {
         while(true){
         try {
             int month = EnterValue.enterValue("Enter the month", Mode.POSITIVE);
             checkMonth(month);
             return month;
         } catch (MonthException | NegativeException e) {
             System.out.println(e.getMessage());
            }
         }
     }

     public static void checkMonth(int month) throws MonthException {
         if (month < 0 || month > 12 ) throw new MonthException("Incorrect month value");
     }

}
