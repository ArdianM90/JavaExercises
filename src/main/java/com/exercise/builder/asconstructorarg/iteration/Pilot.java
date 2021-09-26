package com.exercise.builder.asconstructorarg.iteration;

import lombok.Getter;

import java.util.List;

@Getter
public class Pilot extends Profession {

    private final String language;

    public Pilot(PilotBuilder builder) {
        super(builder.name, builder.salary, builder.duties);
        this.language = builder.getLanguage();
    }

    @Override
    public String work() {
        return "Flying the plane...";
    }
}
