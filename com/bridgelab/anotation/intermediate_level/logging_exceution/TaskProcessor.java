package com.bridgelab.anotation.intermediate_level.logging_exceution;

public class TaskProcessor {

    @LogExecutionTime
    public void fastTask() {
        System.out.println("Executing fastTask...");
        for (int i = 0; i < 1000; i++) {}  // Simulate work
    }

    @LogExecutionTime
    public void slowTask() {
        System.out.println("Executing slowTask...");
        for (int i = 0; i < 10_000_000; i++) {}  // Simulate a slower task
    }

    public void normalTask() {
        System.out.println("Executing normalTask...");
    }
}
