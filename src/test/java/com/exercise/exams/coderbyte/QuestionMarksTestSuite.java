package com.exercise.exams.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionMarksTestSuite {
    @Test
    public void shouldReturnTrue() {
        //Given
        QuestionMarks questionMarks = new QuestionMarks();

        //When
        String case1 = "5???5";
        String case2 = "a5???5";
        String case3 = "5???5a";
        String case4 = "a5???5a";
        String case5 = "aaa5???5aaa";
        String case6 = "5???5aaa";
        String case7 = "aaa5???5";
        String case8 = "aaa3???5???5a";
        String case9 = "acc?7??sss?3rr1??????5";

        //Then
        assertTrue(questionMarks.questionMarks(case1));
        assertTrue(questionMarks.questionMarks(case2));
        assertTrue(questionMarks.questionMarks(case3));
        assertTrue(questionMarks.questionMarks(case4));
        assertTrue(questionMarks.questionMarks(case5));
        assertTrue(questionMarks.questionMarks(case6));
        assertTrue(questionMarks.questionMarks(case7));
        assertTrue(questionMarks.questionMarks(case8));
        assertTrue(questionMarks.questionMarks(case9));
    }

    @Test
    public void shouldReturnFalse() {
        //Given
        QuestionMarks questionMarks = new QuestionMarks();

        //When
        String case1 = "";
        String case2 = "??";
        String case3 = "3???5";
        String case4 = "aa???5a";
        String case5 = "aaa3?s?7???5a";
        String case6 = "5??aaaaaaaaaaaaaaaaaaa?5?5";
        String case7 = "mbbv???????????4??????ddsdsdcc9?";

        //Then
        assertFalse(questionMarks.questionMarks(case1));
        assertFalse(questionMarks.questionMarks(case2));
        assertFalse(questionMarks.questionMarks(case3));
        assertFalse(questionMarks.questionMarks(case4));
        assertFalse(questionMarks.questionMarks(case5));
        assertFalse(questionMarks.questionMarks(case6));
        assertFalse(questionMarks.questionMarks(case7));
    }
}