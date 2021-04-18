package by.epamtc.task_1.task2;


import by.epamtc.task_1.task2.console.InputFromConsole;
import by.epamtc.task_1.task2.entity.Date;

public class Runner {

    public static void main(String... args) {
       Date date =  InputFromConsole.fillClassFields();
       System.out.println(date.toString());
    }
}
