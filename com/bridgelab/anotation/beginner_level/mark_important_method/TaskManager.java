package com.bridgelab.anotation.beginner_level.mark_important_method;


public class TaskManager {
    
    @ImportantMethod(level = "low")
    public void processData() {
        System.out.println("Processing data...");
    }

    @ImportantMethod // Default level is "High"
    public void saveToDatabase() {
        System.out.println("Saving to database...");
    }

    public void helperMethod() {
        System.out.println("Just a helper method...");
    }
}
