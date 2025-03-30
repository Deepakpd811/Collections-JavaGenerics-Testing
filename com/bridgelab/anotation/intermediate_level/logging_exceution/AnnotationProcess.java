package com.bridgelab.anotation.intermediate_level.logging_exceution;

import java.lang.reflect.Method;


public class AnnotationProcess {
    public static void main(String[] args) {
        try {
            TaskProcessor processor = new TaskProcessor();
            Class<?> clazz = processor.getClass();

            for (Method method : clazz.getDeclaredMethods()) {
                //  Check if method has @LogExecutionTime annotation
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    long startTime = System.nanoTime(); // Start time
                    method.invoke(processor);  // Invoke method
                    long endTime = System.nanoTime(); // End time

                    //  Calculate and print execution time
                    System.out.println("⏳ Execution time of " + method.getName() + ": " + (endTime - startTime) / 1_000_000.0 + " ms");
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
