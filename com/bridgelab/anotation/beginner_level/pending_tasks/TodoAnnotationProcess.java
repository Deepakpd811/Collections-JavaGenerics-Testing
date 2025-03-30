package com.bridgelab.anotation.beginner_level.pending_tasks;

import java.lang.reflect.Method;

public class TodoAnnotationProcess {
    public static void main(String[] args) {
        
        try {

            // get the class
            Class<?> clazz = ProjectManager.class;

            //  Loop over all methods
            for(Method method: clazz.getDeclaredMethods()){
                // Check if @Todo annotation is present
                if(method.isAnnotationPresent(Todo.class)){
                    // get the annotation
                    Todo todo = method.getAnnotation(Todo.class);

                    //  Print task details
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println("Method: " + method.getName());    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
