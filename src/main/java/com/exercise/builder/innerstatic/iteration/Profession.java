package com.exercise.builder.innerstatic.iteration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public abstract class Profession {

    private final String name;
    private final double salary;
    private final List<String> duties;

    public abstract String work();

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("Salary", salary)
                .append("Duties", duties)
                .toString();
    }

    public static abstract class Builder<SELF extends ProfessionBuilder<SELF, TTARGET>,
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

        public TTARGET build() {
            return internalBuild();
        }

        protected abstract TTARGET internalBuild();

        private SELF self() {
            return (SELF) this;
        }
    }
}
