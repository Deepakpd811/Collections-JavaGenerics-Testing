package com.bridgelab.exception;

import java.util.Scanner;

public class ExceptionPropagation {

    // Method to calculate interest and throw  illegalArgument exception
    public static double calculateInterest(double amount, double rate, int year) throws IllegalArgumentException {
        if (rate < 0 || amount < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount * rate * year) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Take input from user amoutn rate year
        System.out.println("Enter Amount");
        double amount = sc.nextDouble();

        System.out.println("Enter Rate");
        double rate = sc.nextDouble();

        System.out.println("Enter Year");
        int year = sc.nextInt();

        try {
            // calculate interest
            double interest = calculateInterest(amount, rate, year);
            System.out.println("Intrest: " + interest);
        } catch (IllegalArgumentException e) {
            // handle the exceptio and print the stack trace
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            // Ensure the scanner is closed to prevent resource leaks
            sc.close();
        }

    }
}
