package com.annette.task2;


public class Runner {

    public static void main(String... args) throws MonthException {
        Date date = new Date (Year.enterYear(),Month.enterMonth());
        date.getNumberOfDays(Year.isLeap(date.getYear()));
        date.printDay();
    }
}
