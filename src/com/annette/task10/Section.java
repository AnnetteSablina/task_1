package com.annette.task10;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;

public class Section {
    private int sectionStart;
    private int sectionEnd;
    private int divisionValue;

    Section (){};
    Section (int sectionStart, int sectionEnd,int divisionValue) {
        this.sectionStart = sectionStart;
        this.sectionEnd = sectionEnd;
        this.divisionValue = divisionValue;
    }
    public static Section fromUserInput(){
        int sectionStart;
        int sectionEnd;
        int divisionValue;
        while (true){
            try {
                sectionStart = EnterValue.enterValue("Enter the start value of a section", Mode.ANY);
                sectionEnd = EnterValue.enterValue("Enter the end value of a section", Mode.ANY);
                divisionValue = EnterValue.enterValue("Enter the division value of a section", Mode.ANY);
                checkSection(sectionStart,sectionEnd);
                return new Section(sectionStart,sectionEnd,divisionValue);
            } catch (NegativeException | ZeroException | SectionException e){
               System.out.println(e.getMessage());
            }

        }
    }

    private static void checkSection(int sectionStart,int sectionEnd) throws SectionException {
        System.out.println("lol");
        if (sectionStart > sectionEnd) throw new SectionException("End value is bigger then start");
    }
    public int getSectionStart() {
        return sectionStart;
    }

    public int getDivisionValue() {
        return divisionValue;
    }

    public int getSectionEnd() {
        return sectionEnd;
    }
}
