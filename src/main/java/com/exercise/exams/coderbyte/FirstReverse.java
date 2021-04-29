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
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
}
