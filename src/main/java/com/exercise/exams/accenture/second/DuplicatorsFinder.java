package com.exercise.exams.accenture.second;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DuplicatorsFinder {
    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        Map<Integer, Long> resultMap = integers.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return resultMap.entrySet().stream()
                .filter(e -> e.getValue() == numberOfDuplicates)
                .map(e -> Integer.parseInt(e.getKey().toString()))
                .collect(Collectors.toList());
    }
}
