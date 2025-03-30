package com.bridgelab.reflection.basiclevel.dynamically_create_objects;

import java.lang.reflect.Constructor;


public class ReflectionConstructorExample {
    public static void main(String[] args) {
        try {
            // Get the Class object dynamically
           
            Class<?> cls = Student.class;
          
            // Get the constructor with one String parameter
            Constructor<?> constructor = cls.getConstructor(String.class);

            // Create an instance dynamically
            Student student = (Student) constructor.newInstance("Emma");

            // Call the method
            student.display();  // Output: Student Name: Emma

        } catch (Exception e) {
            e.printStackTrace();  // Print errors for debugging
        }
    }
}
