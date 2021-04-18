package by.epamtc.task_1.task10.console;

import by.epamtc.task_1.task10.entity.Section;
import by.epamtc.task_1.task10.exception.SectionException;
import by.epamtc.task_1.utility.EnterValue;
import by.epamtc.task_1.utility.Mode;
import by.epamtc.task_1.utility.NegativeException;
import by.epamtc.task_1.utility.ZeroException;

import by.epamtc.task_1.task10.logic.SectionLogic;

public class InputFromConsole {
    public static Section InputSectionFields(){
        int sectionStart;
        int sectionEnd;
        int divisionValue;
        while (true){
            try {
                sectionStart = EnterValue.enterValue("Enter the start value of a section", Mode.ANY);
                sectionEnd = EnterValue.enterValue("Enter the end value of a section", Mode.ANY);
                divisionValue = EnterValue.enterValue("Enter the division value of a section", Mode.ANY);
                SectionLogic.checkSection (sectionStart,sectionEnd);
                return new Section(sectionStart,sectionEnd,divisionValue);
            } catch (NegativeException | ZeroException | SectionException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
