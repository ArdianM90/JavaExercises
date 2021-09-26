package com.exercise.builder.lombok.builder.iteration;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
public class Pilot extends Profession {

    private final String language;

    @Builder
    public Pilot(String name, double salary, @Singular("addDuty") List<String> duties, String language) {
        super(name, salary, duties);
        this.language = language;
    }

    @Override
    public String work() {
        return "Flying the plane...";
    }
}
