package com.annette.task2;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static Date fromUserInput() {
        while (true) {
            int year = Year.enterYear();
            int month = Month.enterMonth();
            int day = 0;
            try {
                day = Date.getNumberOfDays(Year.isLeap(year), month);
                return new Date(year, month, day);
            } catch (MonthException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static int getNumberOfDays(boolean isLeap, int month) throws MonthException {
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new MonthException("Unexpected value: ");
        };
        if (month == 2 && isLeap) day = 29;
        return day;
    }


    public void printDay() {
        System.out.println("In " + this.month + " " + this.year + " there are " + this.day + " days");
    }
}
