package com.exercise.builder.asconstructorarg.iteration;

import lombok.Getter;

@Getter
public class EngineerBuilder extends AbstractProfessionBuilder<EngineerBuilder, Engineer> {

    private String tools;

    public EngineerBuilder tools(String tools) {
        this.tools = tools;
        return this;
    }

    @Override
    protected EngineerBuilder internalBuild() {
        return this;
    }
}
