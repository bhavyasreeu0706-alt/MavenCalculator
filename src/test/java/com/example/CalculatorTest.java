package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(4, calculator.subtract(7, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(21, calculator.multiply(7, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(6, 0));
    }
}
