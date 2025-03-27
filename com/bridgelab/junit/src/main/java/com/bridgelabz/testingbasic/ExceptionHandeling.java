package com.brigelabz.testingbasic;

public class ExceptionHandeling {

    // return a/b or throw when b==0
    public static int divide(int a, int b){
        if(b==0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        return a/b;
    }

}
