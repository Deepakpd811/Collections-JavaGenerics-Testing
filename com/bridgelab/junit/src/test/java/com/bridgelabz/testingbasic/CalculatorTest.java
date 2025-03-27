package com.brigelabz.testingbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    Calculator calculator = new Calculator();;

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should be -1");
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should be -1");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(5, 4), "5 - 4 should be 1");
        assertEquals(-3, calculator.subtract(2, 5), "2 - 5 should be -3");
    }

    @Test
    void testMultiplication() {
        assertEquals(10, calculator.multiply(2, 5), "2 * 5 should be 10");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should be 0");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should be 2");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}