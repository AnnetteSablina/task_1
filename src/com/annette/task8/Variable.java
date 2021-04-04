package com.annette.task8;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;
import java.util.Objects;

public class Variable {
    private int variable;

    Variable() {
    }

    Variable(int variable) {
        this.variable = variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    public int getVariable() {
        return variable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variable variable1 = (Variable) o;
        return variable == variable1.variable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable);
    }

    @Override
    public String toString() {
        return "variable= " + variable;
    }

    public static Variable fillVariable() {
        while (true) {
            try {
                int variable = EnterValue.enterValue("Enter the variable", Mode.ANY);
                return new Variable(variable);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
