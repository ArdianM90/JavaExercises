package com.exercise.builder.innerstatic.iteration;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProfessionBuilder<SELF extends ProfessionBuilder<SELF, TTarget>,
        TTarget extends Profession> implements ProfessionBuilder<SELF, TTarget> {

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

    public TTarget build() {
        return internalBuild();
    }

    protected abstract TTarget internalBuild();

    private SELF self() {
        return (SELF) this;
    }
}
