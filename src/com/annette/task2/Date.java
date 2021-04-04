package com.annette.task2;

import java.util.Objects;

public class Date {
    private int year;
    private int month;
    private int day;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return year == date.year && month == date.month && day == date.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return " In Date{" +
                "year=" + year +
                ", month=" + month +
                ", there are " + day +
                " days}";
    }

    public static Date fillClassFields() {
        while (true) {
            int year = YearLogic.enterYear();
            int month = MonthLogic.enterMonth();
            int day = 0;
            try {
                day = Date.countNumberOfDays(YearLogic.isLeap(year), month);
                return new Date(year, month, day);
            } catch (MonthException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static int countNumberOfDays(boolean isLeap, int month) throws MonthException {
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new MonthException("Unexpected value: ");
        };
        if (month == 2 && isLeap) day = 29;
        return day;
    }
}
