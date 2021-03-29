package com.annette.task8;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;

public class Variable {
    private int variable;

    Variable() {
    }

    Variable(int variable) {
        this.variable = variable;
    }

    public int getVariable() {
        return variable;
    }

    public static Variable fromUserInput() {
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
