package com.bridgelabz.testingadvance;

public class RegisterUser {

    public static void registerUser(String username, String email, String password) {

        // email must contain @
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        // Password must have at least 8 characters, one uppercase letter, and one digit
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$";

        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        if (!email.matches(emailRegex)) {
            throw new IllegalArgumentException("Email is invalid");
        }

        if (!password.matches(passwordRegex)) {
            throw new IllegalArgumentException("Password must contain 8 character, one uppercase letter and one digit");
        }

        System.out.println("User Successfully Register");

    }

}
