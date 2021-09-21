package com.exercise.builder.second.iteration;

import java.util.ArrayList;
import java.util.List;

public class EngineerBuilder implements ProfessionBuilder<Engineer> {

    String name;

    double salary;

    List<String> duties = new ArrayList<>();

    @Override
    public ProfessionBuilder<Engineer> name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProfessionBuilder<Engineer> salary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public ProfessionBuilder<Engineer> addDuty(String duty) {
        duties.add(duty);
        return this;
    }

    public Engineer build() {
        return new Engineer(name, salary, duties);
    }
}
