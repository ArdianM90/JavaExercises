package com.exercise.builder.asconstructorarg.iteration;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProfessionBuilder<SELF extends ProfessionBuilder<SELF, TTARGET>,
        TTARGET extends Profession> implements ProfessionBuilder<SELF, TTARGET> {

    String name;

    double salary;

    List<String> duties = new ArrayList<>();

    @Override
    public SELF name(String name) {
        this.name = name;
        return self();
    }

    @Override
    public SELF salary(double salary) {
        this.salary = salary;
        return self();
    }

    @Override
    public SELF addDuty(String duty) {
        duties.add(duty);
        return self();
    }

    public SELF build() {
        return internalBuild();
    }

    protected abstract SELF internalBuild();

    private SELF self() {
        return (SELF) this;
    }
}
