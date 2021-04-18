package by.epamtc.task_1.task10.entity;

public class Section {
    private int sectionStart;
    private int sectionEnd;
    private int divisionValue;

    Section (){}
    public Section(int sectionStart, int sectionEnd, int divisionValue) {
        this.sectionStart = sectionStart;
        this.sectionEnd = sectionEnd;
        this.divisionValue = divisionValue;
    }

    public void setSectionStart(int sectionStart) {
        this.sectionStart = sectionStart;
    }

    public void setSectionEnd(int sectionEnd) {
        this.sectionEnd = sectionEnd;
    }

    public void setDivisionValue(int divisionValue) {
        this.divisionValue = divisionValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return sectionStart == section.sectionStart && sectionEnd == section.sectionEnd && divisionValue == section.divisionValue;
    }

    @Override
    public int hashCode() {
        return (sectionStart+sectionEnd+divisionValue)*31;
    }

    @Override
    public String toString() {
        return "Section{" +
                "[" + sectionStart +
                ";" + sectionEnd +
                "] with division value =" + divisionValue +
                '}';
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
