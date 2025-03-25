package com.bridgelab.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Numerator");
            double numerator = sc.nextDouble();

            System.out.println("Enter Denominator ");
            double denominator = sc.nextDouble();
    
            if (denominator == 0)
            throw new ArithmeticException("denominator cannot be zero");
            
            double result = numerator / denominator;

            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Enter the vaild input" + e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
