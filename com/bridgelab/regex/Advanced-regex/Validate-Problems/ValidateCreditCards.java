public class ValidateCreditCards {

    public static boolean isValidCardNumber(String cardNumber){
        String regex = "^4\\d{15}|^5\\d{15}";
        return cardNumber.matches(regex);
    }
    
    public static void main(String[] args) {
        String[] cardNumbers = {
            "4444445214500566",  
            "5000599566567444",  
            "4444445214500",  
            "5000444445214500",  
            "500049866645214500",  
             
        };

        // Loop through each IP and validate it
        for (String  cardNumber : cardNumbers) {
            System.out.println(cardNumber + " is " + (isValidCardNumber(cardNumber) ? "Valid" : "Invalid"));
        }
    }


}
