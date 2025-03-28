import java.util.regex.*;
import java.util.ArrayList;

public class ExtractCapitalizedWords {

    public static ArrayList<String> extractCapitalizedWords(String text) {
        String regex = "[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> capitalizedWords = new ArrayList<>();
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }

    public static void main(String[] args) {
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        ArrayList<String> words = extractCapitalizedWords(sentence);
        System.out.println(String.join(", ", words));
    }
}
