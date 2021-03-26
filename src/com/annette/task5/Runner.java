package com.annette.task5;

public class Runner {
    public static void main (String...args) {
     int number = EnterNumber.enterNumber();
      System.out.println(CheckPerfection.checkNumberPerfection(number));
    }
}
