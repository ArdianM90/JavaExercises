package com.exercise.builder.first.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstIterationTestSuite {

    @Test
    public void shouldCreateProperEngineerViaBuilder() {
        // given & when
        Engineer engineer = new EngineerBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .build();

        // then
        assertEquals("John", engineer.getName());
        assertEquals(200.0, engineer.getSalary());
        assertEquals(2, engineer.getDuties().size());
    }
}