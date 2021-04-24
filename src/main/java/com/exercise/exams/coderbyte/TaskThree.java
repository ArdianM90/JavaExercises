package com.exercise.exams.coderbyte;

import java.util.*;

public class TaskThree {
    // Have the function ArrayChallenge(arr) read the array of integers stored in arr which will be in the following
    // format: [K, r1, r2, r3, ...] where K represents the number of desks in a classroom, and the rest of the integers
    // in the array will be in sorted order and will represent the desks that are already occupied. All of the desks
    // will be arranged in 2 columns, where desk #1 is at the top left, desk #2 is at the top right, desk #3 is below
    // #1, desk #4 is below #2, etc. Your program should return the number of ways 2 students can be seated next to each
    // other. This means 1 student is on the left and 1 student on the right, or 1 student is directly above or below
    // other student.
    //
    // For example: if arr is [12, 2, 6, 7, 11] then this classroom looks like the following schema (X means occupied
    // seat):
    // 1  X
    // 3  4
    // 5  X
    // X  8
    // 9  10
    // X  12
    //
    // Based on above arrangement of occupied desks, there are a total of 6 ways to seat 2 new students next to each
    // other. The combinations are: [1, 3], [3, 4], [3, 5], [8, 10], [9, 10], [10, 12]. So far this input your program
    // should return 6. K will range from 2 to 24 and will always be an even number. After K, the number of occupied
    // desks in the array can range from 0 to K.
    //
    //Examples:
    //input: new int {6, 4}, output: 4
    //input: new int {8, 1, 8}, output: 6
    private final List<Integer> occupiedSeats = new ArrayList<>();

    public int ArrayChallenge(final int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            occupiedSeats.add(arr[i]);
        }
        Set<Set<Integer>> possibilities = new HashSet<>();
        for (int i = 1; i <= arr[0]; i++) {
            if (!occupiedSeats.contains(i)) {
                Set<Integer> poss;
                if (isValid(arr[0], i-2)) {
                    poss = new HashSet<>();
                    poss.add(i);
                    poss.add(i - 2);
                    possibilities.add(poss);
                }
                if (isValid(arr[0], i+2)) {
                    poss = new HashSet<>();
                    poss.add(i);
                    poss.add(i+2);
                    possibilities.add(poss);
                }
                if (isValid(arr[0], i % 2 == 0 ? i-1 : i+1)) {
                    poss = new HashSet<>();
                    poss.add(i);
                    poss.add(i % 2 == 0 ? i-1 : i+1);
                    possibilities.add(poss);
                }
            }
        }
        return possibilities.size();
    }

    private boolean isValid(int seatsQty, int checkedSeatNo) {
        if (checkedSeatNo <= 0 || checkedSeatNo > seatsQty) {
            return false;
        }
        return !occupiedSeats.contains(checkedSeatNo);
    }
}
