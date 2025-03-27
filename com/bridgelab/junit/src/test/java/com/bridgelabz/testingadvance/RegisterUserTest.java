package com.bridgelabz.testingadvance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RegisterUserTest {

    //Tests valid user registration.
    @Test
    void testValidRegisterUser() {
        String name = "depak";
        String email = "demo@gmail";
        String password = "asdfWade2";
        assertDoesNotThrow(()-> RegisterUser.registerUser(name,email,password));
    }


    //Tests user registration with an empty username
    @Test
    void testUsename(){
        String name = "";
        String email = "demo@gmail";
        String password = "asdfWade2";

        Exception e = assertThrows(IllegalArgumentException.class,()-> RegisterUser.registerUser(name,email,password));
        assertEquals("Username cannot be empty", e.getMessage());
    }

    //Tests invalid passwords using parameterized test cases.
    @ParameterizedTest
    @ValueSource(strings = {"fal","dfha8hfahj","demopassword"}) // array of wrong password
    void testInvalidPassword(String pass){
        String name = "Deepak";
        String email = "demo@gmail";
        String password = pass;

        Exception e = assertThrows(IllegalArgumentException.class,()-> RegisterUser.registerUser(name,email,password));
        assertEquals("Password must contain 8 character, one uppercase letter and one digit", e.getMessage());
    }

    //Tests invalid email formats using parameterized test cases.
    @ParameterizedTest
    @ValueSource(strings = {"email123","@email123","email123@"}) // array of wrong password
    void testInvalideEmail(String emails){
        String name = "Deepak";
        String email = emails;
        String password = "asdfWade2";

        Exception e = assertThrows(IllegalArgumentException.class,()-> RegisterUser.registerUser(name,email,password));
        assertEquals("Email is invalid", e.getMessage());
    }
}