package com.bridgelab.exception;

import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = null; // Initially null

        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            myArray = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                myArray[i] = sc.nextInt();
            }

            System.out.print("Enter the index to retrieve: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + myArray[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized");
        } 
        sc.close();
    }
}