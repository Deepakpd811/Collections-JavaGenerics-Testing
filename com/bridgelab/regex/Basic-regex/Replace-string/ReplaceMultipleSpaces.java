public class ReplaceMultipleSpaces {

    // Method to replace multiple spaces with a single space
    public static String replaceSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String[] texts = {
            "This   is   an  example   with multiple    spaces.",
            "Hello    World!  How   are   you?",
            " No     extra spaces   here  !   ",
            "Multiple      spaces        in       between    words."
        };

        // Loop through each text and replace spaces
        for (String text : texts) {
            System.out.println("Original: " + text);
            System.out.println("Modified: " + replaceSpaces(text));
            System.out.println(); // For better readability
        }
    }
}
