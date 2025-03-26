package com.bridgelab.exception;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();

        System.out.println("Enter the index you want to access");
        int index = sc.nextInt();

        try {

            try {
                int element = arr[index];
                int result = element / divisor;

                System.out.println("Result: " + result);

            } catch (IndexOutOfBoundsException e) {
                System.err.println("Invalid index " + e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.err.println("cant divide by zero " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}
