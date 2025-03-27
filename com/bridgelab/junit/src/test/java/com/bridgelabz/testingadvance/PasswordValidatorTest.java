package com.bridgelabz.testingadvance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    // Tests valid passwords that meet all criteria
    @ParameterizedTest
    @ValueSource(strings = { "Password1", "Dummy@123", "Test@12UI" })
    void isValid(String password) {
        assertEquals(true, PasswordValidator.isValid(password));
    }

    // Tests invalid passwords that do not meet the criteria
    @ParameterizedTest
    @ValueSource(strings = { "hell", "Dummyrewr", "123" })
    void passwordNotValid(String password) {
        assertEquals(false, PasswordValidator.isValid(password));
    }
}