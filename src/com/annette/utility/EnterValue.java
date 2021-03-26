package com.annette.utility;

import java.io.FilterInputStream;
import java.util.Scanner;


public class EnterValue {
   public static int enterValue(String message, Mode mode) throws NegativeException {
        Scanner scanner = new Scanner(new FilterInputStream(System.in){ public void close() {}});
        System.out.println(message);
        while(!scanner.hasNextInt()){
            System.out.println("Try again." + message);
            scanner.next();
        }
        int value = scanner.nextInt();
        if (mode == Mode.POSITIVE && value < 0)  throw new NegativeException("You entered negative value");
        scanner.close();
        return value;
   }
}
