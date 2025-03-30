package com.bridgelab.reflection.advanced_level.generate_json_from_object;

import java.lang.reflect.Field;

public class ReflectionJson {

    public static String toJSON(Object clazz) throws Exception {

        StringBuilder json = new StringBuilder("{");

        // Get all the fields
        Field[] fields = clazz.getClass().getDeclaredFields();

        // Loop every field and append to json stringBuilder
        for (Field field : fields) {
            field.setAccessible(true); // set the access of private fields

            String key = field.getName(); // get field name
            Object value = field.get(clazz); // return type is object

            // append "key"
            json.append("\"").append(key).append("\":");

            if (value instanceof String) {
                // append "value"
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }
            json.append(",");

        }

        json.append("}");

        return json.toString();

    }

    public static void main(String[] args) throws Exception {

        Person person = new Person("Deepak", 20, true);

        String json = toJSON(person);

        System.out.println(json);

    }
}
