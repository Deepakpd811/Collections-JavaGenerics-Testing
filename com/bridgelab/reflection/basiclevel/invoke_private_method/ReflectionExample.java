package com.bridgelab.reflection.basiclevel.invoke_private_method;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        
        
        try {
            Calculator cal = new Calculator();
    
            Class<?> c = cal.getClass();
            
            // Get the method
            Method method = c.getDeclaredMethod("multiply",int.class ,int.class);

            // set private method accessible
            method.setAccessible(true);

            // call the method by invoke
            int result = (int) method.invoke(cal,3, 5);

            // print the result
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
