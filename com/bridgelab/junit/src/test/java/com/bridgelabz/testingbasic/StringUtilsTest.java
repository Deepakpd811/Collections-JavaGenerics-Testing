package com.brigelabz.testingbasic;

import org.junit.jupiter.api.Test;

import com.brigelabz.testingbasic.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

     StringUtils stringMethods = new StringUtils();

    @Test
    void reverse() {
        assertEquals("olleH", stringMethods.reverse("Hello"));

        // Reverse of an empty string should be empty
        assertEquals("", stringMethods.reverse("") );

        // Reverse of null should be null
        assertNull(stringMethods.reverse(null) );
    }

    @Test
    void isPalindrome() {
        //madam' should be a palindrome
        assertTrue(stringMethods.isPalindrome("madam"));

        //racecar should be a palindrome
        assertTrue(stringMethods.isPalindrome("racecar"));

        //Level should be a palindrome (case-insensitive)
        assertTrue(stringMethods.isPalindrome("Level"), "'");

        //hello is not a palindrome
        assertFalse(stringMethods.isPalindrome("hello"));

        //"null is not a palindrome"
        assertFalse(stringMethods.isPalindrome(null));
    }

    @Test
    void toUpperCase() {
        //"'hello' should convert to 'HELLO'"
        assertEquals("HELLO", stringMethods.toUpperCase("hello"));

        // "'WORLD' should remain 'WORLD'"
        assertEquals("WORLD", stringMethods.toUpperCase("WORLD"));

        // "Empty string should remain empty"
        assertEquals("", stringMethods.toUpperCase(""));

        // "null should return null"
        assertNull(stringMethods.toUpperCase(null));
    }
}