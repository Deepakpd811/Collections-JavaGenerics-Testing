
import java.util.regex.*;
import java.util.ArrayList;

public class ExtractEmails {

    // Extracts all email addresses from the given text
    public static ArrayList<String> extractEmails(String text) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {

        String[] texts = {
            "Contact us at support@example.com and info@company.org",
            "No emails here!",
            "Reach us at admin@website.net, sales@shop.com",
            "Random text with user123@gmail.com inside",
            "Multiple: first@mail.com, second@work.org, third@edu.edu"
        };

        // Loop through each text and extract email addresses
        for (String text : texts) {
            ArrayList<String> emails = extractEmails(text);
            System.out.println("Text: " + text);
            if (emails.isEmpty()) {
                System.out.println("No emails found");
            } else {
                for (String email : emails) {
                    System.out.println(email);
                }
            }
            System.out.println(); // For better readability
        }
    }
}
