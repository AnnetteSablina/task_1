package com.annette.task1;

public class Runner {

    public static void main(String... args) {
        int number = NumberLogic.enterInt();
        NumberLogic.printLastNumber(NumberLogic.getLastSquareNumber(number));
    }
}
