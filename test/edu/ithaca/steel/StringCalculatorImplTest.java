package edu.ithaca.steel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorImplTest {

    @Test
    void add() {

        // initializes a calculator object and tests addition with empty string
        StringCalculator calculator = new StringCalculatorImpl();
        assertEquals(0,calculator.add(""));

    }
}