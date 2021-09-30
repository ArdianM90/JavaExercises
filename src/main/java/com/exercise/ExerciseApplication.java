package com.exercise;

import com.exercise.codeblock.StaticBlockOfCode;
import com.exercise.exams.other.StringAppendations;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication {
    public static void main(String[] args) {
//        StringAppendations.run();
        StaticBlockOfCode myBlock = new StaticBlockOfCode();
    }
}
