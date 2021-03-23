package com.annette.Task2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class EnterValue {
   public static int enterValue(String message){
        Scanner scanner = new Scanner(new FilterInputStream(System.in){ public void close() {}});
        System.out.println(message);
        while(!scanner.hasNextInt()){
            System.out.println("Try again." + message);
            scanner.next();
        }
        int year = scanner.nextInt();
       scanner.close();
        return Math.abs(year);
   }
}
