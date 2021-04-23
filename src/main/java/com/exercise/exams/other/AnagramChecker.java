package com.exercise.exams.other;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    private Scanner scanner = new Scanner(System.in);

    public boolean checkIfAnagram() {
        char[] entry1array = getEntryVal("Enter first String value:").toCharArray();
        char[] entry2array = getEntryVal("Enter second String value:").toCharArray();
        Arrays.sort(entry1array);
        Arrays.sort(entry2array);
        return Arrays.equals(entry1array, entry2array);
    }

    private String getEntryVal(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
