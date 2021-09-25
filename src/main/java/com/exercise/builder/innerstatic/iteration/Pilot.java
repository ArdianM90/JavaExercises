package com.exercise.builder.innerstatic.iteration;

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

    public static class Builder extends AbstractProfessionBuilder<Builder, Pilot> {

        private String language;

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        @Override
        protected Pilot internalBuild() {
            return new Pilot(this.name, this.salary, this.duties, this.language);
        }
    }
}
