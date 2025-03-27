package com.brigelabz.testingbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandelingTest {

    //Create object for testing
    ExceptionHandeling exceptiondivide = new ExceptionHandeling();

    @Test
    void divideByNonZero() {
        assertEquals(5, exceptiondivide.divide(10,2));
    }
    @Test
    void divideByZero(){
        Exception exception = assertThrows(ArithmeticException.class, ()-> exceptiondivide.divide(12,0));
        assertEquals("cannot divide by zero", exception.getMessage());
    }
}