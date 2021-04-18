package by.epamtc.task_1.task10.table;

import by.epamtc.task_1.utility.NullException;

import java.util.Map;

public class PrintTable {
    public static void printTable (Map<Integer,Double> table) throws NullException {
        if (table == null) throw new NullException("Table is null");
        System.out.println("---------Table----------");
        System.out.println("Value--------Tan--------");
        for (Map.Entry<Integer, Double> entry : table.entrySet()) {
            System.out.println(entry.getKey() + "     ->     " + entry.getValue());
        }
    }
}
