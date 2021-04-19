package com.exercise;

import com.exercise.exams.accenture.second.AccentureExamsSummary;
import com.exercise.exams.kodilla.middle.MiddleExamSummary;

public class ExerciseApplication {
    public static void main(String[] args) {
        MiddleExamSummary middleExamSummary = new MiddleExamSummary();
        AccentureExamsSummary accentureExamsSummary = new AccentureExamsSummary();
        middleExamSummary.show();
        accentureExamsSummary.show();
    }
}
