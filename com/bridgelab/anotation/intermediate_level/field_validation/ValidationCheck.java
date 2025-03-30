package com.bridgelab.anotation.intermediate_level.field_validation;

public class ValidationCheck {
    public static void main(String[] args) {
        
        try {
            // Valid username (length = 9)
            User user = new User("Deepak");
            user.display();
            
            // Invalid username (length = 12, exceeds limit)
            User user2 = new User("Deepak_Prasad");
            user2.display();
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }   
}
