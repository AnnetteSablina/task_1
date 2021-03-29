package com.annette.task10;

import java.util.Map;

public class PrintTable {
    public static void printTable (Map<Integer,Double> table){
        System.out.println("---------Table----------");
        System.out.println("Value--------Tan--------");
        for (Map.Entry<Integer, Double> entry : table.entrySet()) {
            System.out.println(entry.getKey() + "     ->     " + entry.getValue());
        }
    }
}
