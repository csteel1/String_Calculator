package edu.ithaca.steel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorImplTest {

    @Test
    void add() {

        // initializes a calculator object and tests addition with empty string
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(0,calculator.add(""));

        // tests for single number strings
        assertEquals(7,calculator.add("7"));
        assertEquals(0,calculator.add("3.14"));
        assertEquals(0,calculator.add("0"));
        assertEquals(-23,calculator.add("-23"));
        assertEquals(0,calculator.add("b"));

        // tests for two number strings
        assertEquals(18,calculator.add("14,4"));
        assertEquals(-10,calculator.add("-6,-4"));
        assertEquals(13,calculator.add("-20,33"));

        // tests for unknown amount of numbers
        assertEquals(10,calculator.add("1,2,3,4"));
        assertEquals(-15,calculator.add("7,10,-20,1,-3,-19,9"));

        // tests for handling new lines as interchangeable with commas
        assertEquals(19,calculator.add("7,4\n10,-1\n-1"));

    }
}