package by.epamtc.task_1.task6.logic;

public class SecondsTransformation {
    public static final int secondsNumberPerHour = 3600;
    public static final int minutesNumberPerHour = 60;

    public static int countHours(int seconds){
        return seconds / secondsNumberPerHour;
    }
    public static int countMinutes(int seconds){
        return (seconds - countHours(seconds)*secondsNumberPerHour/minutesNumberPerHour);
    }
    public static int countSeconds(int seconds){
        return (seconds - (countHours(seconds)*secondsNumberPerHour + countMinutes(seconds) * minutesNumberPerHour));
    }

}
