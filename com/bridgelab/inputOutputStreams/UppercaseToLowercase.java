package com.bridgelab.inputOutputStreams;

import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) {
        String inputFile = "uppercase.txt"; // Replace with your input file path
        String outputFile = "lowercase.txt"; // Replace with your output file path

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))) {

            int character;
            while ((character = reader.read()) != -1) {
                char ch = (char) character;
                if (Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                }
                writer.write(ch);
            }

            System.out.println("Uppercase to lowercase conversion complete.");

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}