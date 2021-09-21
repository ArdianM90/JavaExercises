package com.exercise.builder.second.iteration;

import java.util.List;

public class Engineer extends Profession {

    public Engineer(String name, double salary, List<String> duties) {
        super(name, salary, duties);
    }

    @Override
    public String work() {
        return "Implementing and testing...";
    }
}
