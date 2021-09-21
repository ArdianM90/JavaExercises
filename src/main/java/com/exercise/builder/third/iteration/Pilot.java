package com.exercise.builder.third.iteration;

import lombok.Getter;

import java.util.List;

@Getter
public class Pilot extends Profession {

    private final String language;

    public Pilot(String name, double salary, List<String> duties, String language) {
        super(name, salary, duties);
        this.language = language;
    }

    @Override
    public String work() {
        return "Flying the plane...";
    }
}
