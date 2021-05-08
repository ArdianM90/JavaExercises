package com.exercise.exams.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntersectionTestSuite {
    @Test
    public void shouldReturnExpectedString() {
        //Given
        String[] input1 = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        String output1 = "1,4,13";
        String[] input2 = new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        String output2 = "1,9,10";

        //When&Then
        assertEquals(output1, FindIntersection.findIntersection(input1));
        assertEquals(output2, FindIntersection.findIntersection(input2));
    }

    @Test
    public void shouldReturnFalse() {
        //Given
        String[] input1 = new String[] {"3, 5, 6, 7, 14", ""};
        String[] input2 = new String[] {"", "1, 2, 4, 13, 15"};
        String[] input3 = new String[] {"3, 5, 6, 7, 14", ""};
        String[] input4 = new String[] {"3, 5, 6, 7, 14", "1, 2, 4, 13, 15"};
        String[] input5 = new String[] {"1, 3, 9, 11, 17, 18", "2, 4, 10, 16"};
        String output = "false";

        //When&Then
        assertEquals(output, FindIntersection.findIntersection(input1));
        assertEquals(output, FindIntersection.findIntersection(input2));
        assertEquals(output, FindIntersection.findIntersection(input3));
        assertEquals(output, FindIntersection.findIntersection(input4));
        assertEquals(output, FindIntersection.findIntersection(input5));
    }
}