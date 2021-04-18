package by.epamtc.task_1.task1;

public class Runner {

    public static void main(String... args) {
        int number = EnterNumber.enterInt();
        int lastNumber = NumberLogic.getLastSquareNumber(number);
        System.out.println(lastNumber);
    }
}
