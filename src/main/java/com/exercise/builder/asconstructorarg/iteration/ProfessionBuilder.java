package com.exercise.builder.asconstructorarg.iteration;

public interface ProfessionBuilder<SELF extends ProfessionBuilder<SELF, TTARGET>, TTARGET extends Profession> {

    SELF name(String name);

    SELF salary(double salary);

    SELF addDuty(String duty);

    SELF build();
}
