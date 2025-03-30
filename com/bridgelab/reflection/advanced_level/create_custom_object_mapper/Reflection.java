package com.bridgelab.reflection.advanced_level.create_custom_object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class Reflection {

    // return object from map<String,Object> type
    public static <T> T toObject(Class<T> clazz,Map<String, Object> data) throws Exception {

        T instance = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : data.entrySet()) {
            String fieldName = entry.getKey(); // get string key
            Object fieldValue = entry.getValue(); // get any object field(Integer,String,Boolean,etc..)

            try {

                // Get the field from the class
                Field field = clazz.getDeclaredField(fieldName);

                // set accescale true
                field.setAccessible(true);

                // set the value;
                field.set(instance, fieldValue);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }

        }

        return instance;
    }

    public static void main(String[] args) throws Exception {

        Map<String, Object> data = Map.of(
                "name", "deepak",
                "fjal", 34,
                "age", 30);

        // creating a person object
        // passed person class to extra and set the fields
        Person person = toObject(Person.class, data);

        person.display();
    }
}
