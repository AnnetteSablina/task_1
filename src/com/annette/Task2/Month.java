package com.annette.Task2;

public class Month  {

     public static int enterMonth() {
         while(true){
         try {
             int month = EnterValue.enterValue("Enter the month");
             checkMonth(month);
             return month;
         } catch (MonthException e) {
             System.out.println(e.getMessage());
         }
         }
     }

     public static void checkMonth(int month) throws MonthException {
         if (month < 0 || month > 12 ) throw new MonthException("Incorrect month value");
     }

}
