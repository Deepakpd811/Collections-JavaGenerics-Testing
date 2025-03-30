package com.bridgelab.anotation.beginner_level.mark_important_method;

import java.lang.reflect.Method;

public class ImportantMethodProcess {
    public static void main(String[] args) {

        try {

            // Get the class TaskManger
            Class<?> clazz = TaskManager.class;

            // Loop over all method
            for (Method method : clazz.getDeclaredMethods()) {
                // check if annotation is present
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    // Retrieve annotation
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

                    System.out.println(method.getName() + " is " + annotation.level() + " level task");

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
