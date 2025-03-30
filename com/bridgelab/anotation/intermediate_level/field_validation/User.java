package com.bridgelab.anotation.intermediate_level.field_validation;

import java.lang.reflect.Field;
import java.nio.file.NoSuchFileException;

public class User {

    @MaxLength(10)   // field username is annotated
    String username;

    User(String username){

        validate(username); // validate the username length

        this.username= username;
    }

    public void validate(String username){

        try {

            // Get the class
            Class<?> clazz = this.getClass();

            // Get the field 

            Field field = clazz.getDeclaredField("username");;

            // Check the annotation @MaxLength is presnt 

            if(field.isAnnotationPresent(MaxLength.class)){

                // Get the annotaed value
                int maxLength = field.getAnnotation(MaxLength.class).value();

                if(username.length() > maxLength){
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength + " characters.");
                }

            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    public void display(){
        System.out.println(username);
    }

}
