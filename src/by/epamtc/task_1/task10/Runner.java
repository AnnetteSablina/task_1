package by.epamtc.task_1.task10;

import by.epamtc.task_1.task10.console.InputFromConsole;
import by.epamtc.task_1.task10.entity.Section;
import by.epamtc.task_1.task10.table.MakeTanTable;
import by.epamtc.task_1.task10.table.PrintTable;
import by.epamtc.task_1.utility.NullException;

public class Runner {
    public static void main (String ... args){
        Section section = InputFromConsole.InputSectionFields();
        try {
            PrintTable.printTable(MakeTanTable.makeTable(section));
        } catch (NullException e) {
            e.printStackTrace();
        }
    }
}
