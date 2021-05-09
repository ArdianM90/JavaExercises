package com.exercise.exams.coderbyte;

public class CodelandUsernameValidation {
//    Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string
//    is a valid username according to the following rules:
//    1. The username is between 4 and 25 characters.
//    2. It must start with a letter.
//    3. It can only contain letters, numbers, and the underscore character.
//    4. It cannot end with an underscore character.
//    If the username is valid then your program should return the string true, otherwise return the string false.
//    Examples:
//    Input: "aa_", Output: false
//    Input: "u__hello_world123", Output: true
    public static String codelandUsernameValidation(String str) {
        if (str.length() < 4 || str.length() > 25 || !Character.isLetter(str.charAt(0)) || str.charAt(str.length()-1) == '_') {
            return "false";
        }
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && str.charAt(i) != '_') {
                return "false";
            }
        }
        return "true";
    }
}
