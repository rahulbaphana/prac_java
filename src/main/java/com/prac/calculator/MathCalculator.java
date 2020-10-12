package com.prac.calculator;

import static java.util.stream.IntStream.rangeClosed;

public class MathCalculator {

    public static final int SEED = 1;

    public static int factorialOf(int number) {
        return rangeClosed(1, number).reduce(SEED, (a, b) -> a * b);
    }
}
