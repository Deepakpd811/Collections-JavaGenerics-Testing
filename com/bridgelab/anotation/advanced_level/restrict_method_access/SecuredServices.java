package com.bridgelab.anotation.advanced_level.restrict_method_access;

public class SecuredServices {
    
    @RoleAllowed("ADMIN")
    public void adminLevelAccess(){
        System.out.println("Admin acess");
    }

    public void publicLevelAccess(){
        System.out.println("public acess");
    }

}
