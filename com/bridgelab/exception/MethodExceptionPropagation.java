package com.bridgelab.exception;

import java.util.Scanner;

public class MethodExceptionPropagation {

    // method1 might throw Arithmatic exception
    public static void method1(int numerator, int denominator) {
        int result = numerator / denominator;
        System.out.println(result);
    }

    // method2 call method1
    public static void method2(int numerator, int denominator) {
        method1(numerator, denominator);
        System.out.println("this line not reached when exception occuer");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        int numerator = sc.nextInt();
        System.out.println("Enter Denominator");
        int denominator = sc.nextInt();

        try {

            method2(numerator, denominator);

        } catch (ArithmeticException e) { // handle the exception
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
