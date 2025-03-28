
import java.util.regex.*;
import java.util.ArrayList;

public class ExtractLinks {

    // Extracts all valid URLs from the given text
    public static ArrayList<String> extractLinks(String text) {
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(/\\S*)?\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {

        String[] texts = {
            "Visit https://www.google.com and http://example.org for more info.",
            "Check out my blog at http://mywebsite.com/blog/ and https://github.com/user.",
            "This is not a link: www.fake.com or google.com/test",
            "Follow us on social media: https://twitter.com/example and https://facebook.com/profile",
            "Invalid URLs: http:/example.com, htt://wrong.com, https://"
        };

        // Loop through each text and extract links
        for (String text : texts) {
            ArrayList<String> links = extractLinks(text);
            System.out.println("Text: " + text);
            if (links.isEmpty()) {
                System.out.println("No links found");
            } else {
                System.out.println(String.join(", ", links));
            }
            System.out.println(); // For better readability
        }
    }
}
