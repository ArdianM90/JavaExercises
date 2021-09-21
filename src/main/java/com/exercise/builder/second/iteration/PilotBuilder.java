package com.exercise.builder.second.iteration;

public class PilotBuilder extends AbstractProfessionBuilder<Pilot> {

    @Override
    protected Pilot internalBuild() {
        return new Pilot(this.name, this.salary, this.duties);
    }
}
