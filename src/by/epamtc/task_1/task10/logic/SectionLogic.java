package by.epamtc.task_1.task10.logic;

import by.epamtc.task_1.task10.exception.SectionException;

public class SectionLogic {
    public static void checkSection(int sectionStart, int sectionEnd) throws SectionException {
        if (sectionStart > sectionEnd) throw new SectionException("End value is bigger then start");
    }
}
