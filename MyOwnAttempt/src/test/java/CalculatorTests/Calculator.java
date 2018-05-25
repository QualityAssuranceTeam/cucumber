package CalculatorTests;

public class Calculator {

    static Integer sumNumbers(Integer a, Integer b) {

        Integer sum = a + b;
        return sum;

    }

    static Integer multiplyNumbers(Integer a, Integer b) {

        Integer mult = a * b;
        return mult;

    }

    static double divide(Double a, Double b) {

        double div = a / b;
        if (b == 0) {
            div = -0;
            return div;
        }
        else return div;
    }
}