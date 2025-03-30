package com.bridgelab.reflection.intermediate_level.retrieve_annotations;

import java.lang.reflect.Method;

public class ReflectionGetAnotation {
    public static void main(String[] args) {

        try {
            Book book = new Book();
            // Get the class
            Class<?> cls = book.getClass();
            
            Method method = cls.getMethod("display");

            // Checking the annotation present in class
            if (cls.isAnnotationPresent(Author.class)) {

                // Retrive the anotation
                Author author = cls.getAnnotation(Author.class);

                // print the annotation name
                System.out.println(author.name());

            }

            // invoke method
            method.invoke(book);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // for debuging
        }

    }
}
