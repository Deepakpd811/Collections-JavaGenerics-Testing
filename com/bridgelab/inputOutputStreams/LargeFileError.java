package com.bridgelab.inputOutputStreams;

import java.io.*;

public class LargeFileError{

    public static void main(String[] args) {
        String filename = "large_file.txt"; // Replace with your large file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}