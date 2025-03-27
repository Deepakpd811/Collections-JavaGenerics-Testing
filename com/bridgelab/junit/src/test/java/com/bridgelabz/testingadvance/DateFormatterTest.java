package com.bridgelabz.testingadvance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Unit tests for the DateFormatter class.
class DateFormatterTest {

    DateFormatter df = new DateFormatter();

    // Tests valid date conversion from yyyy-MM-dd to dd-MM-yyyy.
    @Test
    void testconvert() {
        String date = "2025-06-21";
        assertEquals("21-6-2025", df.convert(date));
    }

    // Tests conversion with an incorrectly formatted date string.
    @Test
    void testconvertInvalidFormat() {
        String date = "20254-036-231";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> df.convert(date));
        assertEquals("Please Enter Valid Date", exception.getMessage());
    }

    // Tests conversion with an invalid day value.
    @Test
    void testInvalidDateconvert() {
        String date = "2025-06-36";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> df.convert(date));
        assertEquals("Invalid date", exception.getMessage());
    }

    // Tests conversion with an invalid month value.
    @Test
    void testInvalidMonthconvert() {
        String date = "2025-33-21";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> df.convert(date));
        assertEquals("Invalid month", exception.getMessage());
    }

    // Tests conversion when passing a null value
    @Test
    void testNullConvert() {
        assertNull(df.convert(null));
    }

}