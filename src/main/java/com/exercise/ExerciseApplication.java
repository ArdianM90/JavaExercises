package com.exercise;

import com.exercise.exams.coderbyte.FindIntersection;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication {
    public static void main(String[] args) {
        String[] arr = new String[] {"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"};
        System.out.println(FindIntersection.findIntersection(arr));
    }
}
