package com.annette.Task2;
import java.util.Scanner;
public class Year  {
    public static int enterYear(){
        return EnterValue.enterValue("Enter the year");
    }
    public static boolean isLeap (int year){
        boolean isLeap = false;
        if (year % 4 == 0 && year % 100 != 0) {
            isLeap  = true;
        } else if (year % 400 == 0) {
            isLeap = true;
        }
        return isLeap;
    }


}
