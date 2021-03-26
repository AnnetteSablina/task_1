package com.annette.Task4;

public class NumbersLogic {
    public static boolean parityCheck(int a,int b, int c, int d){
        return (a & 1) + (b & 1) + (c & 1) + (d & 1) < 3;
    }
}
