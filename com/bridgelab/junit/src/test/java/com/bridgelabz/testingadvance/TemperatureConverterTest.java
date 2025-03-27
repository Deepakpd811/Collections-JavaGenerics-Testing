package com.bridgelabz.testingadvance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Test class for TemperatureConverter.
class TemperatureConverterTest {

    // Tests Celsius to Fahrenheit conversion.
    @Test
    void celsiusToFahrenheit() {
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100));
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
    }

    // Tests Fahrenheit to Celsius conversion
    @Test
    void fahrenheitToCelsius() {
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212));
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
    }

}