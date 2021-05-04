package com.exercise.exams.coderbyte;

public class LongestWord {
//    Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
//    If there are two or more words that are the same length, return the first word from the string with that length.
//    Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example
//    "Hello world123 567"
//    Examples:
//    Input: "fun&!! time", Output: "time"
//    Input: "I love dogs", Output: "love"
    public String longestWord(String sen) {
        String result = "";
        char[] senArr = sen.toCharArray();
        for (int i = 0; i < senArr.length; i++) {
            if (Character.isLetterOrDigit(senArr[i])) {
                int wordLength = 1;
                while (i+wordLength < sen.length() && Character.isLetterOrDigit(senArr[i+wordLength])) {
                    wordLength++;
                }
                if (wordLength > result.length()) {
                    result = sen.substring(i, i + wordLength);
                }
                i = i + wordLength;
            }
        }
        return result;
    }
}
