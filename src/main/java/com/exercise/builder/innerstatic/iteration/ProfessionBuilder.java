package com.exercise.builder.innerstatic.iteration;

public interface ProfessionBuilder<SELF extends ProfessionBuilder<SELF, TTARGET>, TTARGET extends Profession> {

    SELF name(String name);

    SELF salary(double salary);

    SELF addDuty(String duty);

    TTARGET build();
}
