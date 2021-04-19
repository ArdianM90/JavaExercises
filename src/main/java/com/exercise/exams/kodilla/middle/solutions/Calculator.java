package com.exercise.exams.kodilla.middle.solutions;

public class Calculator {
    public long add(long a, long b) {
        return a + b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
}
