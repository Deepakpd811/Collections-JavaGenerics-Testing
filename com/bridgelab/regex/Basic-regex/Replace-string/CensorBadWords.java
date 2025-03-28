public class CensorBadWords {

    // method to replace bad word in both upercase and lower case
    public static String censor(String sentence, String[] badwords){
        for(String badword: badwords){
            sentence = sentence.replaceAll("(?i)"+badword, "*****");
        }
        return sentence;
    }


    public static void main(String[] args) {
        String str = "This sentence contain Bad and stupid word";
        String[] badWord = {"bad", "stupid"};

        System.out.println("Original sentence: " + str);

        System.out.println("Censor sentence: " + censor(str,badWord));

    }
}
