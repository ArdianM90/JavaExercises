package com.exercise.exams.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionMarksTestSuite {
    @Test
    public void shouldReturnTrue() {
        //Given
        String case1 = "5???5";
        String case2 = "a5???5";
        String case3 = "5???5a";
        String case4 = "a5???5a";
        String case5 = "aaa5???5aaa";
        String case6 = "5???5aaa";
        String case7 = "aaa5???5";
        String case8 = "aaa3???5???5a";
        String case9 = "acc?7??sss?3rr1??????5";

        //When&Then
        assertTrue(QuestionMarks.questionMarks(case1));
        assertTrue(QuestionMarks.questionMarks(case2));
        assertTrue(QuestionMarks.questionMarks(case3));
        assertTrue(QuestionMarks.questionMarks(case4));
        assertTrue(QuestionMarks.questionMarks(case5));
        assertTrue(QuestionMarks.questionMarks(case6));
        assertTrue(QuestionMarks.questionMarks(case7));
        assertTrue(QuestionMarks.questionMarks(case8));
        assertTrue(QuestionMarks.questionMarks(case9));
    }

    @Test
    public void shouldReturnFalse() {
        //Given
        String case1 = "";
        String case2 = "??";
        String case3 = "3???5";
        String case4 = "aa???5a";
        String case5 = "aaa3?s?7???5a";
        String case6 = "5??aaaaaaaaaaaaaaaaaaa?5?5";
        String case7 = "mbbv???????????4??????ddsdsdcc9?";

        //When&Then
        assertFalse(QuestionMarks.questionMarks(case1));
        assertFalse(QuestionMarks.questionMarks(case2));
        assertFalse(QuestionMarks.questionMarks(case3));
        assertFalse(QuestionMarks.questionMarks(case4));
        assertFalse(QuestionMarks.questionMarks(case5));
        assertFalse(QuestionMarks.questionMarks(case6));
        assertFalse(QuestionMarks.questionMarks(case7));
    }
}