package com.exercise;

import com.exercise.exams.coderbyte.CodelandUsernameValidation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication {
    public static void main(String[] args) {
        String username = "u__hello_world123";
        System.out.println(CodelandUsernameValidation.codelandUsernameValidation(username));
    }
}
