package com.exercise.exams.other;

import java.util.function.Predicate;

public class PredicateTest {
    public void run() {
        Predicate<Integer> predicate = integer -> integer == 10;
        System.out.println(predicate.test(10));
    }
}
