package com.bridgelab.exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ValidateAge {

    // Handle custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid");
        }
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            int age = sc.nextInt();
            validateAge(age);

            System.out.println("Access Granted");

            // sc.close();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
