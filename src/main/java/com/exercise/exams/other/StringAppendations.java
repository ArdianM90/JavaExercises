package com.exercise.exams.other;

public class StringAppendations {
    public static void run() {
        String s1 = 50+30+"test"+40+40; //will return 80test4040
        String s2 = 50+30+40+"test"+40+40; //will return 120test4040
        String s3 = "test"+50+30+"test"+40+40; //will return test5030test4040
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
