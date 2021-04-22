package com.exercise;

import com.exercise.exams.other.AnagramChecker;

public class ExerciseApplication {
    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();
        System.out.println(anagramChecker.checkIfAnagram());
    }
}
