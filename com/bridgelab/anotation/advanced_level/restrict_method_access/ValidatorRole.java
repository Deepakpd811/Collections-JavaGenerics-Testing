package com.bridgelab.anotation.advanced_level.restrict_method_access;

import java.lang.reflect.Method;

public class ValidatorRole {

    public static void invokeMethod(Object obj, String methodName, User user) {

        // Get the class

        try {

            Class<?> clazz = obj.getClass();

            Method method = clazz.getDeclaredMethod(methodName);

            // check if method @RoleAllowed present
            if (method.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed annotationRole = method.getAnnotation(RoleAllowed.class);
                String requireRole = annotationRole.value();

                if (!requireRole.equals(user.getRole())){
                    System.out.println("Access Denied! ");
                    return;
                }

                method.invoke(obj);
                
            }else{
                method.invoke(obj);

            }

        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        SecuredServices securedServices = new SecuredServices();

        User admin = new User("ADMIN");
        User user = new User("USER");

        invokeMethod(securedServices, "adminLevelAccess", admin);
        invokeMethod(securedServices, "adminLevelAccess", user);
        invokeMethod(securedServices, "publicLevelAccess", user);

    }
}
