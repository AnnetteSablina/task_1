package com.annette.Task1;
import java.util.Scanner;

public class Number {
    public static int enterInt(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the value");
        while(!scanner.hasNextInt()){
            System.out.println("Try again. Enter the value");
            scanner.next();
        }
        return scanner.nextInt();
    }
   public static int getLastNumber(int number){
       return switch (number){
            case 2,8 -> 4;
            case 3,7 -> 9;
            case 4-> 6;
            case 9 -> 1;
            default -> number % 10;
       };
   }
   public static void printNumber(int lastNumber){
        System.out.println("Last number is " + lastNumber);
   }
}
