package com.exercise.codeblock;

public class StaticBlockOfCode {
    private String name;

    public StaticBlockOfCode() {
        System.out.println("Constructor");
        name = "testing block of code";
        System.out.println("My name: "+name);
    }

    static {
        System.out.println("Static block of code");
    }
}
