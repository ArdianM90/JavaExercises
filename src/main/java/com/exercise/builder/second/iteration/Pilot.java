package com.exercise.builder.second.iteration;

import java.util.List;

public class Pilot extends Profession {

    public Pilot(String name, double salary, List<String> duties) {
        super(name, salary, duties);
    }

    @Override
    public String work() {
        return "Flying the plane...";
    }
}
