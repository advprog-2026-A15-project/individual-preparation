package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {

    public double add(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double subtract(double o1, double o2) {
        return o1 - o2;
    }

    public double multiply(double o1, double o2) {
        return (o1 * o2);
    }

    public double divide(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double exponent(double o1, int n) {
        double result = 1.0;

        if (n == 0) {
            return 1.0;
        }

        int power = Math.abs(n);

        for (int i = 0; i < power; i++) {
            result *= o1;
        }

        if (n < 0) {
            return 1.0 / result;
        }

        return result;
    }
}
