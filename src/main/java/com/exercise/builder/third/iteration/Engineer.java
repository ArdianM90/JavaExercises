package com.exercise.builder.third.iteration;

import lombok.Getter;

import java.util.List;

@Getter
public class Engineer extends Profession {

    private final String tools;

    public Engineer(String name, double salary, List<String> duties, String tools) {
        super(name, salary, duties);
        this.tools = tools;
    }

    @Override
    public String work() {
        return "Implementing and testing...";
    }
}
