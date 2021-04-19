package com.exercise.exams.kodilla.middle.solutions;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class CalculatorTestSuite {
    @Test
    public void testAdd() {
        //Given
        Calculator calculator = new Calculator();

        //When
        long result = calculator.add(123L, 234);

        //Then
        Assertions.assertEquals(357, result);
    }
}