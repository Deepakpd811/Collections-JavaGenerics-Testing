package com.bridgelab.reflection.basiclevel.get_class_Information;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionInfo {

    // Method to display fields of the given class
    public static void DisplayFields(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields(); // Get all declared fields (including private ones)
        for (Field field : fields) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName()); // Print field type and name
        }
    }

    // Method to display methods of the given class
    public static void DisplayMethods(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods(); // Get all declared methods
        for (Method method : methods) {
            System.out.println(method.getReturnType().getSimpleName() + " " + method.getName());
        }
    }

    // Method to display constructors of the given class
    public static void DisplayConstructors(Class<?> cls) {
        Constructor<?>[] constructors = cls.getDeclaredConstructors(); // Get all declared constructors

        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor: " + constructor.getName()); // Print constructor name
            Class<?> parem[] = constructor.getParameterTypes(); // Get constructor parameters

            for (int i = 0; i < parem.length; i++) {
                System.out.println("parameter " + parem[i].getSimpleName());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the full class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();
        scanner.close(); // Close scanner to avoid resource leak

        try {
            // Load the class dynamically using the user input
            Class<?> cls = Class.forName("com.bridgelab.reflection.BasicLevel.GetClassInformation." + className);

            // Display class name
            System.out.println("\nClass Name: " + cls.getSimpleName());

            // Display fields
            System.out.println("\n🔹 Fields:");
            DisplayFields(cls);

            // Display methods
            System.out.println("\n🔹 Methods:");
            DisplayMethods(cls);

            // Display constructors
            System.out.println("\n🔹 Constructors:");
            DisplayConstructors(cls);

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found. Please enter a valid class name."); // Handle case when class is not
                                                                        
        }
    }
}
