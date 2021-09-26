package com.exercise.builder.innerstatic.iteration;

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

    public static class Builder extends Profession.Builder<Builder, Engineer> {

        private String tools;

        public Builder tools(String tools) {
            this.tools = tools;
            return this;
        }

        @Override
        protected Engineer internalBuild() {
            return new Engineer(this.name, this.salary, this.duties, this.tools);
        }
    }
}
