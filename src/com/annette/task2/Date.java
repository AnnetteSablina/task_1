package com.annette.task2;

public class Date {
    int year;
    int month;
    int day;

    Date(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public void getNumberOfDays(boolean isLeap) {
        this.day = switch (this.month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
        if (this.month == 2 && isLeap) this.day = 29;
    }

    public int getYear() {
        return year;
    }

    public void printDay() {
        System.out.println("In " + this.month + " " + this.year + " there are " + this.day + " days");
    }
}
