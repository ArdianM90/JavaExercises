package com.exercise.builder.lombok.builder.iteration;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
public class Engineer extends Profession {

    private final String tools;

    @Builder
    public Engineer(String name, double salary, @Singular("addDuty") List<String> duties, String tools) {
        super(name, salary, duties);
        this.tools = tools;
    }

    @Override
    public String work() {
        return "Implementing and testing...";
    }
}
