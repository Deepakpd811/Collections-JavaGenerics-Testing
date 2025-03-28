public class ValidateLicensePlate {

    // Return true if the license plate meets the regex condition
    public static boolean validateLicensePlate(String plate) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return plate.matches(regex);
    }

    public static void main(String[] args) {

        String[] licensePlates = { "AB1234", "A12345", "ABC123", "XY5678", "Xy1234", "AB12C4", "AB12345", "12AB34" };

        // Loop through each license plate and validate it against the pattern
        for (String plate : licensePlates) {
            System.out.println(plate + " " + (validateLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
