package com.bridgelab.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name to read");
        String file =sc.nextLine();

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // print the data
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not exist" + file);
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
