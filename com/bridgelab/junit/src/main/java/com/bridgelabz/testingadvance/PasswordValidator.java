package com.bridgelabz.testingadvance;

//Validates if a password has at least 8 characters, one uppercase letter, and one digit.
public class PasswordValidator {

    // Returns true if password meets the criteria; otherwise, false.
    public static boolean isValid(String password) {
        if (password.length() < 8)
            return false;
        if (!password.matches(".*[A-Z].*"))
            return false;
        if (!password.matches(".*\\d.*"))
            return false;
        return true;
    }
}
