public class ValidateUsername {

    // return true if username met certain regex condition
    public static boolean validateUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        String[] userNames = { "user_123", "123user", "us" };

        // Loop through each username and validate it against the pattern
        for (String userName : userNames) {
            System.out.println(userName + " " + (validateUsername(userName) ? "Valid" : "Invalid"));
        }
    }
}
