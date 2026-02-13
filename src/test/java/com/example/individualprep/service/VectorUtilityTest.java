package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testDotProduct_validVectors() {
        double[] v1 = {1, 2, 3};
        double[] v2 = {4, 5, 6};
        double expected = 32;
        double actual = vectorUtility.dotProduct(v1, v2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testDotProduct_zeroVector() {
        double[] v1 = {0, 0, 0};
        double[] v2 = {4, 5, 6};
        double expected = 0;
        double actual = vectorUtility.dotProduct(v1, v2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testDotProduct_negativeValues() {
        double[] v1 = {-1, -2, -3};
        double[] v2 = {4, 5, 6};
        double expected = -32;
        double actual = vectorUtility.dotProduct(v1, v2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testDotProduct_singleElement() {
        double[] v1 = {5};
        double[] v2 = {7};
        double expected = 35;
        double actual = vectorUtility.dotProduct(v1, v2);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testDotProduct_differentLength_shouldThrow() {
        double[] v1 = {1, 2};
        double[] v2 = {4, 5, 6};
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        });
    }

    @Test
    void testDotProduct_nullFirstVector_shouldThrow() {
        double[] v1 = null;
        double[] v2 = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        });
    }

    @Test
    void testDotProduct_nullSecondVector_shouldThrow() {
        double[] v1 = {1, 2, 3};
        double[] v2 = null;
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        });
    }

    @Test
    void testAdd() {
        double[] v1 = {1,2};
        double[] v2 = {3,4};
        assertArrayEquals(new double[]{4,6}, vectorUtility.add(v1, v2), 0.0001);
    }

    @Test
    void testSubtract() {
        double[] v1 = {5,7};
        double[] v2 = {2,3};
        assertArrayEquals(new double[]{3,4}, vectorUtility.subtract(v1, v2), 0.0001);
    }

    @Test
    void testMultiply() {
        double[] v1 = {1,2,3};
        assertArrayEquals(new double[]{2,4,6}, vectorUtility.multiply(v1, 2), 0.0001);
    }

    @Test
    void testNorm() {
        double[] v1 = {3,4};
        assertEquals(5, vectorUtility.norm(v1), 0.0001);
    }
}