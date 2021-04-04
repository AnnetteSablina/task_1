package com.annette.task4;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;
import java.util.Objects;

public class Value {
    private int firstValue;
    private int secondValue;
    private int thirdValue;
    private int forthValue;

    public Value (){
        firstValue = 0;
        secondValue = 0;
        thirdValue = 0;
        forthValue = 0;
    };

    public Value(int firstValue, int secondValue, int thirdValue, int forthValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.forthValue = forthValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public void setForthValue(int forthValue) {
        this.forthValue = forthValue;
    }

    public void setThirdValue(int thirdValue) {
        
        this.thirdValue = thirdValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public int getThirdValue() {
        return thirdValue;
    }

    public int getForthValue() {
        return forthValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return firstValue == value.firstValue && secondValue == value.secondValue && thirdValue == value.thirdValue && forthValue == value.forthValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue, thirdValue, forthValue);
    }

    @Override
    public String toString() {
        return "Number{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                ", thirdValue=" + thirdValue +
                ", forthValue=" + forthValue +
                '}';
    }

    public static Value fillClassFields(){
        while(true){
            try {
                int firstValue = EnterValue.enterValue("Enter the first value", Mode.ANY);
                int secondValue = EnterValue.enterValue("Enter the second value", Mode.ANY);
                int thirdValue = EnterValue.enterValue("Enter the third value", Mode.ANY);
                int forthValue = EnterValue.enterValue("Enter the forth value", Mode.ANY);
                return new Value(firstValue,secondValue,thirdValue,forthValue);
            } catch (NegativeException | ZeroException e) {
               System.out.println(e.getMessage());
            }

        }
    }

}
