package com.exercise.exams.kodilla.middle.solutions;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());
    }
}
