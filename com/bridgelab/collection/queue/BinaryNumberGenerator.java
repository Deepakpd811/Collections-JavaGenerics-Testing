package com.bridgelab.collection.queue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {

    // Method to generateBinaryNumbers
    public static String[] generateBinaryNumbers(int n) {
        if (n <= 0) {
            return new String[0]; // Empty array for invalid input
        }

        String[] result = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.add("1"); // Start with the first binary number

        for (int i = 0; i < n; i++) {
            
            String current = queue.remove();
    
            result[i] = current;

            // Generate the next two binary numbers by appending '0' and '1'
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        String[] binaryNumbers = generateBinaryNumbers(n);

        System.out.print("Binary Numbers: " + Arrays.toString(binaryNumbers));
       
    }
}