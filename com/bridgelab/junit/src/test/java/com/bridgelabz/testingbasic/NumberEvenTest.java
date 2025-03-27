package com.brigelabz.testingbasic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class NumberEvenTest {

    // testing with ParameterizedTest with multiple value
    @ParameterizedTest
    @ValueSource(ints = {2,4,5})
    void testisEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, NumberEven.isEven(number),
                "isEven should return " + expected + " for number: " + number);
    }
}