package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testSubtract_positiveNumbers() {
        double o1 = 10;
        double o2 = 4;
        double expected = 6;
        double actual = arithmeticUtility.subtract(o1, o2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testSubtract_negativeResult() {
        double o1 = 3;
        double o2 = 7;
        double expected = -4;
        double actual = arithmeticUtility.subtract(o1, o2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testSubtract_zero() {
        double o1 = 5;
        double o2 = 0;
        double expected = 5;
        double actual = arithmeticUtility.subtract(o1, o2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testSubtract_doubleValues() {
        double o1 = 5.7;
        double o2 = 2.2;
        double expected = 3.5;
        double actual = arithmeticUtility.subtract(o1, o2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testSubtract_negativeNumbers() {
        double o1 = -5;
        double o2 = -3;
        double expected = -2;
        double actual = arithmeticUtility.subtract(o1, o2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testSubtract_largeNumbers() {
        double o1 = 1e6;
        double o2 = 1e-6;
        double expected = 999999.999999;
        double actual = arithmeticUtility.subtract(o1, o2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testAdd() {
        assertEquals(5, arithmeticUtility.add(2, 3));
        assertEquals(-1, arithmeticUtility.add(2, -3));
        assertEquals(0, arithmeticUtility.add(0, 0));
        assertEquals(67, arithmeticUtility.add(60, 7));
    }

    @Test
    void testMultiply() {
        assertEquals(6, arithmeticUtility.multiply(2, 3));
        assertEquals(-6, arithmeticUtility.multiply(2, -3));
        assertEquals(0, arithmeticUtility.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, arithmeticUtility.divide(6, 3));
        assertEquals(-2, arithmeticUtility.divide(6, -3));
        assertThrows(ArithmeticException.class, () -> arithmeticUtility.divide(5, 0));
    }

    @Test
    void testExponent() {
        assertEquals(8, arithmeticUtility.exponent(2, 3));
        assertEquals(1, arithmeticUtility.exponent(5, 0));
        assertEquals(0.125, arithmeticUtility.exponent(2, -3), 0.0001);
    }
}