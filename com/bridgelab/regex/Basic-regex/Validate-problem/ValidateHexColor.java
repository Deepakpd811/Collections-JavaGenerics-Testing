public class ValidateHexColor {

    // Return true if the hex color code meets the regex condition
    public static boolean validateHexColor(String color) {
        String regex = "^#([a-fA-F0-9]{6})$";
        return color.matches(regex);
    }

    public static void main(String[] args) {

        String[] hexColors = { "#1A2B3C", "123ABC", "#FFF", "#GHIJKL", "#abcdef", "#123456" };

        // Loop through each hex color and validate it against the pattern
        for (String color : hexColors) {
            System.out.println(color + " " + (validateHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}
