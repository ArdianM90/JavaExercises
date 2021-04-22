package com.exercise.exams.other;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    private Scanner scanner = new Scanner(System.in);

    public boolean checkIfAnagram() {
        char[] entry1array = getString("Enter first String value:").toCharArray();
        char[] entry2array = getString("Enter second String value:").toCharArray();
        Arrays.sort(entry1array);
        Arrays.sort(entry2array);
        return Arrays.equals(entry1array, entry2array);
    }

    private String getString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
