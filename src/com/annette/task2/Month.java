package com.annette.task2;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;

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
