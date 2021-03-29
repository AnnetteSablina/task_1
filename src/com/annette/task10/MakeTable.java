package com.annette.task10;


import java.util.Map;
import java.util.TreeMap;

public class MakeTable {
    public static Map<Integer, Double> makeTable (Section section){
        Map <Integer,Double>  table = new TreeMap<>();
        int firstValue = section.getSectionStart();
        int secondValue = section.getSectionEnd();
        int division = section.getDivisionValue();
        while (firstValue <= secondValue) {
            table.put(firstValue, Math.tan(firstValue));
            firstValue += division;
        }
        return table;
    }
}
