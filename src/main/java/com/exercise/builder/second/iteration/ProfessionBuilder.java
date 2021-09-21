package com.exercise.builder.second.iteration;

public interface ProfessionBuilder<T extends Profession> {

    ProfessionBuilder<T> name(String name);

    ProfessionBuilder<T> salary(double salary);

    ProfessionBuilder<T> addDuty(String duty);

    T build();
}
