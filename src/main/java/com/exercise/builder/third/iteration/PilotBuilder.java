package com.exercise.builder.third.iteration;

public class PilotBuilder extends AbstractProfessionBuilder<PilotBuilder, Pilot> {

    private String language;

    public PilotBuilder language(String language) {
        this.language = language;
        return this;
    }

    @Override
    protected Pilot internalBuild() {
        return new Pilot(this.name, this.salary, this.duties, this.language);
    }
}
