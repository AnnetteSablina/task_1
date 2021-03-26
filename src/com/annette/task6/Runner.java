package com.annette.task6;

public class Runner {
    public static void main(String... args) {
        int seconds = EnterSeconds.enterSeconds();
        System.out.println("Hours: " + SecondsTransformation.countHours(seconds)
                + " Minutes: " + SecondsTransformation.countMinutes(seconds) +
                " Seconds:" + SecondsTransformation.countSeconds(seconds));
    }
}
