package com.exercise;

import com.exercise.exams.coderbyte.LongestWord;
import com.exercise.exams.other.ExceptionInTryCatchTest;

public class ExerciseApplication {
    public static void main(String[] args) {
        LongestWord longestWord = new LongestWord();
        System.out.println("RESULT: "+longestWord.longestWord("123456789 98765432"));
    }
}
