package com.exercise.exams.accenture.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccentureExamsSummary {
    public void show() {
        //================================
        //Accenture exam - DuplicatorsFinder() should return list of numbers, which are duplicated specified times in given arrayList
        //DuplicatorsFinder() should be able to receive nulls, but should not count them as duplicates
        //When no duplicates found, should return empty ArrayList
        List<Integer> integers = Arrays.asList(null, -1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6, null);
        DuplicatorsFinder duplicatorsFinder = new DuplicatorsFinder();
        List<Integer> resultDuplicates = duplicatorsFinder.findDuplicates(integers, 2);
        System.out.println("Should be -1, 3 and 6: "+resultDuplicates);
        //================================
    }
}
