package com.exercise.exams.coderbyte;

public class QuestionMarks {
    public boolean questionMarks(String str) {
        for (int i = 1; i < str.length()-3; i++) {
            if (str.startsWith("???", i)) {
                char leftChar = str.charAt(i-1);
                char rightChar = str.charAt(i+3);
                if (Character.isDigit(leftChar) && Character.isDigit(rightChar)) {
                    int leftNum = Character.getNumericValue(str.charAt(i-1));
                    int rightNum = Character.getNumericValue(str.charAt(i+3));
                    if ((leftNum + rightNum) == 10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
