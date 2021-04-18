package by.epamtc.task_1.task10.table;


import by.epamtc.task_1.task10.entity.Section;
import by.epamtc.task_1.utility.NullException;

import java.util.Map;
import java.util.TreeMap;

public class MakeTanTable {
    public static Map<Integer, Double> makeTable (Section section) throws NullException {
        if (section == null) throw new NullException("Section is null");
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
