package com.bridgelabz.testingadvance;

public class DateFormatter {

    //Converts a date from yyyy-MM-dd format to dd-MM-yyyy format.
    public String convert(String inputdate) {

        if (inputdate == null)
            return null;

        // Regular expression to validate the yyyy-MM-dd date format
        String regex = "\\d{4}-\\d{2}-\\d{2}";

        if (!inputdate.matches(regex)) {
            throw new IllegalArgumentException("Please Enter Valid Date");
        }

        String[] parts = inputdate.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int date = Integer.parseInt(parts[2]);

        // Validates the month value.
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }

        // Validates the day value.
        if (date < 1 || date > 31) {
            throw new IllegalArgumentException("Invalid date");
        }
        // Returns the formatted date in dd-MM-yyyy format.
        return date + "-" + month + "-" + year;
    }
}
