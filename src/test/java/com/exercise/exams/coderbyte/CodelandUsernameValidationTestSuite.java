package com.exercise.exams.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodelandUsernameValidationTestSuite {
    @Test
    public void shouldValidatePositive() {
        //Given
        String result = "true";
        String case1 = "u__hello_world123";
        String case2 = "A__hello_world12A";

        //When&Then
        assertEquals(result, CodelandUsernameValidation.codelandUsernameValidation(case1));
        assertEquals(result, CodelandUsernameValidation.codelandUsernameValidation(case2));
    }

    @Test
    public void shouldValidateNegative() {
        //Given
        String result = "false";
        String case1 = "aa_";
        String case2 = "123abc444";
        String case3 = "A__hello_world12_";

        //When&Then
        assertEquals(result, CodelandUsernameValidation.codelandUsernameValidation(case1));
        assertEquals(result, CodelandUsernameValidation.codelandUsernameValidation(case2));
        assertEquals(result, CodelandUsernameValidation.codelandUsernameValidation(case3));
    }
}