package com.exercise.builder.first.iteration;

import java.util.List;

public class Engineer extends Profession {

    public Engineer(String name, double salary, List<String> duties) {
        super(name, salary, duties);
    }

    @Override
    public void work() {
        System.out.println("Implementing and testing...");
    }
}
