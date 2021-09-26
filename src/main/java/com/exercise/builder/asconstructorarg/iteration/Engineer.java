package com.exercise.builder.asconstructorarg.iteration;

import lombok.Getter;

@Getter
public class Engineer extends Profession {

    private final String tools;

    public Engineer(EngineerBuilder builder) {
        super(builder.name, builder.salary, builder.duties);
        this.tools = builder.getTools();
    }

    @Override
    public String work() {
        return "Implementing and testing...";
    }
}
