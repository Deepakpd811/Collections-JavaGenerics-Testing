package com.bridgelab.reflection.intermediate_level.access_and_modify_static_fields;

import java.lang.reflect.Field;

public class ReflectionConfig {
    public static void main(String[] args) {
        
        try {
            // Get class
            Class<?> cls = Configuration.class;

            // Get field api key
            Field field = cls.getDeclaredField("API_KEY");

            // set accessible true
            field.setAccessible(true);
            
            System.out.println("Old key: "+Configuration.API_KEY);

            // modify the static api key
            field.set(null, "Modify key");

            System.out.println("Modify key: "+Configuration.API_KEY);

        } catch (Exception e) {
           System.out.println(e.getMessage());
           e.printStackTrace();// for debuging
        }

    }
}
