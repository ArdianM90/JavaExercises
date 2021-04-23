package com.exercise.exams.coderbyte;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringChallengeOne {
    // Have the function StringChallenge(str) take the str parameter being passed and return a compressed version
    // of the string using the Run-length encoding algorithm. This algorithm works by taking the occurrence of each
    // repeating character and outputting that number along with a single character of repeating sequence. The string
    // will not contain any numbers, punctuation, or symbols.
    // Examples:
    // input "wwwggopp", return "3w2g1o2p";
    // input "aabbcde", return "2a2b1c1d1e";
    // input "wwwbbbw", return "3w3b1w";
    public String StringChallenge(String str) {
        StringBuilder result = new StringBuilder();
        int charIndicator = 0;
        while (charIndicator < str.length()) {
            int occurQty = 1;
            int checkNextIndic = 1;
            while (charIndicator+checkNextIndic < str.length() && str.charAt(charIndicator) == str.charAt(charIndicator+checkNextIndic)) {
                occurQty++;
                checkNextIndic++;
            }
            result.append(occurQty).append(str.charAt(charIndicator));
            charIndicator += occurQty;
        }
        return result.toString();
    }
}
