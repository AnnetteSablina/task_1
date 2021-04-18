package by.epamtc.task_1.task4.logic;


public class NumberLogic {
    public static boolean isTwoParityValues(int firstValue,int secondValue,int thirdValue,int forthValue) {
        return (firstValue & 1) + (secondValue& 1) + (thirdValue& 1)
                + (forthValue & 1) < 3;
    }
}
