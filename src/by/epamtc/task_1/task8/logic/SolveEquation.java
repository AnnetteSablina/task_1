package by.epamtc.task_1.task8.logic;


public class SolveEquation {
    public static double solveEquation(int variable) {
        double result;
        if (variable < 3) return result = (1 / (Math.pow(variable, 3) - 6));
        else return result = (-Math.pow(variable, 2) + 3 * variable + 9);
    }
}
