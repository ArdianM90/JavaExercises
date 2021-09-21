package com.exercise.builder.second.iteration;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProfessionBuilder<T extends Profession> implements ProfessionBuilder<T> {

    String name;
    double salary;
    List<String> duties = new ArrayList<>();

    @Override
    public ProfessionBuilder<T> name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProfessionBuilder<T> salary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public ProfessionBuilder<T> addDuty(String duty) {
        duties.add(duty);
        return this;
    }

    public T build() {
        return internalBuild();
    }

    protected abstract T internalBuild();
}
