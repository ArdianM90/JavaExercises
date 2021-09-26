package com.exercise.builder.asconstructorarg.iteration;

import lombok.Getter;

@Getter
public class PilotBuilder extends AbstractProfessionBuilder<PilotBuilder, Pilot> {

    private String language;

    public PilotBuilder language(String language) {
        this.language = language;
        return this;
    }

    @Override
    protected PilotBuilder internalBuild() {
        return this;
    }
}
