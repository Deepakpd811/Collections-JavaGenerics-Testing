package com.bridgelab.regex;

import java.util.Scanner;

public class ValidateUsername {

    // return true if username met certain regex condition
    public static boolean validateUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username");
        String str = sc.nextLine();

        System.out.println(str + " is " + (validateUsername(str) ? "Valid" : "Invalid"));

        sc.close();

    }
}
