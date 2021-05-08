package com.exercise;

import com.exercise.exams.coderbyte.QuestionMarks;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication {
    public static void main(String[] args) {
        QuestionMarks questionMarks = new QuestionMarks();
        System.out.println("RESULT: "+questionMarks.questionMarks("mbbv???????????4??????ddsdsdcc9?"));
    }
}
