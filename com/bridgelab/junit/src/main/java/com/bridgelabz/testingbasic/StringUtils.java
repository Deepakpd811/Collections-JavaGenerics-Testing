package com.brigelabz.testingbasic;

public class StringUtils {

    // Method to return revers a string
    public static String reverse(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Method to return palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed); // Case-insensitive comparison
    }

    //Method to uppercase
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

}
