package com.exercise.builder.innerstatic.iteration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
}
