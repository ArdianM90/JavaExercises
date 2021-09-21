package com.exercise.builder.third.iteration;

public interface ProfessionBuilder<SELF extends ProfessionBuilder<SELF, TTarget>, TTarget extends Profession> {

    SELF name(String name);

    SELF salary(double salary);

    SELF addDuty(String duty);

    TTarget build();
}
