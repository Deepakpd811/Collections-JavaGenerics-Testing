import java.util.regex.*;

public class ValidateSSN {

    // Method to validate SSN format
    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";  // SSN format: XXX-XX-XXXX
        return ssn.matches(regex);
    }

    public static void main(String[] args) {
        String[] ssnNumbers = { "123-45-6789", "123456789", "987-65-4321", "12-345-6789" };

        // Loop through each SSN and validate it
        for (String ssn : ssnNumbers) {
            System.out.println("\"" + ssn + "\" is " + (isValidSSN(ssn) ? "Valid" : "Invalid"));
        }
    }
}
