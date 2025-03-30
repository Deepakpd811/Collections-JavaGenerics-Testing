package com.bridgelab.anotation.beginner_level.pending_tasks;


public class ProjectManager {

    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void implementLogin() {
        System.out.println("Login feature implementation pending...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob") // Default priority: MEDIUM
    public void optimizeDB() {
        System.out.println("Database optimization pending...");
    }

    @Todo(task = "Enhance UI design", assignedTo = "Charlie", priority = "LOW")
    public void enhanceUI() {
        System.out.println("UI improvements pending...");
    }

    public void completedFeature() {
        System.out.println("This feature is already implemented.");
    }
}
