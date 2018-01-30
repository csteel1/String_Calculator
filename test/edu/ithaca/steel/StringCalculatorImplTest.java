package edu.ithaca.steel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorImplTest {

    @Test
    void add() {

        // initializes a calculator object and tests addition with empty string
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(0,calculator.add(""));

        // tests for single number strings;
        assertEquals(7,calculator.add("7"));
        assertEquals(0,calculator.add("3.14"));
        assertEquals(0,calculator.add("0"));
        assertEquals(-23,calculator.add("-23"));
        assertEquals(0,calculator.add("b"));

    }
}