import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {

    // Method to find repeating words
    public static Set<String> findRepeatingWords(String text) {
        String regex = "\\b(\\w+)\\b(?:.*?\\b\\1\\b)"; // Captures repeating words
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeatingWords = new HashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1)); // Add the repeated word
        }
        return repeatingWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        Set<String> words = findRepeatingWords(text);
        System.out.println("Repeating Words: " + String.join(", ", words));
    }
}
