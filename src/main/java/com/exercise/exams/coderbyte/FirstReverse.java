package com.exercise.exams.coderbyte;

public class FirstReverse {
//    Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
//    For example: if the input string is "Hello World and Coders" then your program should return the string
//    "sredoC dna dlroW olleH.
//
//    Examples:
//    Input: "coderbyte", Output: "etybredoc"
//    Input: "I Love Code", Output: edoC evoL I
    public String firstReverse(String str) {
        char[] strArr = str.toCharArray();
        String result = "";
        for (int i = strArr.length; i > 0; i--) {
            result = result.concat(Character.toString(strArr[i-1]));
        }
        return result;
    }
}
