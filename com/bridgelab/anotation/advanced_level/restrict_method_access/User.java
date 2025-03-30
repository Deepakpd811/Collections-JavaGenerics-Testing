package com.bridgelab.anotation.advanced_level.restrict_method_access;

public class User {
    String role;
    User(String role){
        this.role = role;
    }
   
    public String getRole() {
        return role;
    }
}
