package com.annette.task6;

public class SecondsTransformation {
    public static int countHours(int seconds){
        return seconds / 3600;
    }
    public static int countMinutes(int seconds){
        return (seconds - countHours(seconds)*3600)/60;
    }
    public static int countSeconds(int seconds){
        return (seconds - (countHours(seconds)*3600 + countMinutes(seconds) * 60));
    }

}
