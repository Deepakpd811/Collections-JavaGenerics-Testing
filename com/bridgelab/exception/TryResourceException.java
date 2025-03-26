package com.bridgelab.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceException {
    public static void main(String[] args) {
        String filename = "info.txt";

        // try-resource
        try (
                FileReader fr = new FileReader(filename);
                BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) { // handle IO-exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
