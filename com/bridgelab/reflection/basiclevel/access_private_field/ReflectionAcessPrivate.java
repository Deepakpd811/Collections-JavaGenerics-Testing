package com.bridgelab.reflection.basiclevel.access_private_field;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;

public class ReflectionAcessPrivate {
    public static void main(String[] args)  {
        
        
        try {
            Person p1 = new Person();
            Class<?> c = p1.getClass();
    
            // Get the value
            Field field = c.getDeclaredField("age");
            field.setAccessible(true);

            System.out.println("Old value: " + field.get(p1));
           
            // set the value
            field.set(p1, 20);
            System.out.println("New value: " + field.get(p1));
            
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
}
