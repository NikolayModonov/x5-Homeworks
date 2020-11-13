package ru.x5.java05_1;

public class Calculator {

    // Addition, Subtraction, Multiplication, Division,

    public void Addition(int operand1, int operand2, Logger calcLogger) {
        calcLogger.log(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
    }

    public void Subtraction(int operand1, int operand2, Logger calcLogger) {
        calcLogger.log(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
    }

    public void Multiplication(int operand1, int operand2, Logger calcLogger) {
        calcLogger.log(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
    }

    public void Division(int operand1, int operand2, Logger calcLogger) {
        calcLogger.log(operand1 + " / " + operand2 + " = " + (1.0 * operand1 / operand2));
    }


}
