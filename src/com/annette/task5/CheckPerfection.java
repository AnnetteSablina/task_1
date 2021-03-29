package com.annette.task5;

public class CheckPerfection {
    public static boolean checkNumberPerfection(int number) {
        int summa = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) summa += i;
        }
        return number == summa;
    }
}
