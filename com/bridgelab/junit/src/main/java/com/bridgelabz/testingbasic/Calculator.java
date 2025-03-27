package com.brigelabz.testingbasic;


public class Calculator {

    //Method to add
    public int add(int a, int b) {
        return a + b;
    }
    //Method to subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    //Method to multipy
    public int multiply(int a, int b) {
        return a * b;
    }

    //Method to divide
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

