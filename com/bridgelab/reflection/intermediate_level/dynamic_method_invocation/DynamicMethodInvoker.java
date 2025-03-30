package com.bridgelab.reflection.intermediate_level.dynamic_method_invocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoker {
    public static void main(String[] args) {
        // Try-resource to avoid resource leak
        try (Scanner scanner = new Scanner(System.in)) {

            // ✅ Step 2: Ask user for method name and parameters
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get Class and Method dynamically
            Math mathOps = new Math();
            Class<?> clazz = mathOps.getClass();

            // Find method by name and parameter types
            Method method = clazz.getMethod(methodName, int.class, int.class);

            // Step 4: Invoke the method dynamically
            Object result = method.invoke(mathOps, num1, num2);

            //  Step 5: Print result
            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Error: Method not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}