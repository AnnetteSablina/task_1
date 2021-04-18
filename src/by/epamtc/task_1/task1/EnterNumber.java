package by.epamtc.task_1.task1;

import java.util.Scanner;

public class EnterNumber {
    public static int enterInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        while (!scanner.hasNextInt()) {
            System.out.println("Try again. Enter the value");
            scanner.next();
        }
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}
