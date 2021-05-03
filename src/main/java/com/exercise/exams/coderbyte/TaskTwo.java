package com.exercise.exams.coderbyte;

public class TaskTwo {
    // Have the function StringChallenge(str) take the str parameter being passed and determined if it is possible
    // to create a palindromic string of minimum length 3 characters by removing 1 or 2 characters. For example: if str
    // is "abjchba" then you can remove the characters "jc" to produce "abhba" which is a palindrome. For this example
    // your program should return the two characters that were removed with no delimiter and in the order they appear
    // in the string, so "jc". If 1 or 2 characters cannot be removed to produce a palindrome, then return the string
    // "not possible".
    //
    // If the input string is already the palindrome, your program should return the string "palindrome". Your program
    // should always remove character that appears earlier in the string. In example above, you can also remove "ch"
    // to form a palindrome but "jc" appears first, so the correct answer is "jc".
    //
    // The input will only contain lowercase alphabetic characters. Your program should always attempt to create
    // the longest palindromic substring by removing 1 or 2 characters (see second sample test case as an example).
    // The 2 characters you remove do not have to be adjacent in the string.
    //
    // Examples:
    // input "mmop", output "not possible";
    // input "kjjjhjjj", output "k";

    public String StringChallenge(final String str) {
        if (isPalindrome(str)) {
            return "palindrome";
        }
        for (int i = 0; i < str.length(); i++) {
            StringBuilder tempSequence = new StringBuilder(str);
            if (i == 0) {
                tempSequence.deleteCharAt(0);
            } else if (i == str.length()-1) {
                tempSequence.deleteCharAt(str.length()-1);
            } else {
                tempSequence.delete(i, i+1);
            }
            if (isPalindrome(tempSequence.toString())) {
                return str.substring(i, i+1);
            }
        }
        for (int i = 0; i < str.length()-1; i++) {
            StringBuilder tempSequence = new StringBuilder();
            tempSequence.append(str);
            if (i == 0) {
                tempSequence.delete(0, 2);
            } else if (i == str.length()-2) {
                tempSequence.delete(str.length()-2, str.length());
            } else {
                tempSequence.delete(i, i+2);
            }
            if (isPalindrome(tempSequence.toString())) {
                return str.substring(i, i+2);
            }
        }
        return "not possible";
    }

    private boolean isPalindrome(String str) {
        if (str.length() < 3) {
            return false;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.reverse();
        return str.equals(builder.toString());
    }
}
