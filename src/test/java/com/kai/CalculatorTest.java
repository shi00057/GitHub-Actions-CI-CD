package com.kai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldWork() {
        var calc = new Calculator();
        assertEquals(3, calc.add(1, 2));
        assertEquals(0, calc.add(2, -2));
    }

    @Test
    void multiply_shouldWork() {
        var calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(100, 0));
    }
}
