package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {

    public double[] add(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Vector can't be null");
        }

        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vector dimensions must match");
        }

        double[] result = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }

        return result;
    }


    public double[] subtract(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Vector cannot be null");
        }

        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vector dimensions must match");
        }

        double[] result = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] - v2[i];
        }

        return result;
    }

    public double[] multiply(double[] v1, int x) {
        if (v1 == null) {
            throw new IllegalArgumentException("Vector cannot be null");
        }

        double[] result = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] * x;
        }

        return result;
    }

    public double dotProduct(double[] v1, double[] v2) {
        // Validation
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Vectors cannot be null");
        }
        if (v1.length != v2.length){
            throw new IllegalArgumentException("The vectors must be the same length");
        }

        // Dot Product Operation/Implementation
        double result = 0.0;
        for (int i = 0; i < v1.length; i++) {
            result += v1[i] * v2[i];
        }
        return result;
    }

    public double norm(double[] v1) {
        if (v1 == null) {
            throw new IllegalArgumentException("Input vector cannot be null");
        }
        return Math.sqrt(v1[0] * v1[0] + v1[1] * v1[1]);
    }
}