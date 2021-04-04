package com.annette.task8;


public class SolveEquation {
    public static double solveEquation(Variable variable){
        double result;
        if (variable.getVariable()<3) return result =  (1/(Math.pow(variable.getVariable(),3)-6));
        else return result = (-Math.pow(variable.getVariable(),2) + 3 * variable.getVariable() + 9);
    }
}
