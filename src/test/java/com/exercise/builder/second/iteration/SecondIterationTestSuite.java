package com.exercise.builder.second.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SecondIterationTestSuite {
    @Test
    public void shouldCreateProperEngineerViaBuilder() {
        // given & when
        Engineer engineer = createMockEngineer();

        // then
        assertEquals("John", engineer.getName());
        assertEquals(200.0, engineer.getSalary());
        assertEquals(2, engineer.getDuties().size());
    }

    @Test
    public void shouldCreateProperPilotViaBuilder() {
        // given & when
        Pilot pilot = createMockPilot();

        // then
        assertEquals("John", pilot.getName());
        assertEquals(200.0, pilot.getSalary());
        assertEquals(2, pilot.getDuties().size());
    }

    @Test
    public void shouldWorkValuesBeDifferent() {
        // given & when
        Engineer engineer = createMockEngineer();
        Pilot pilot = createMockPilot();

        //then
        assertNotEquals(engineer.work(), pilot.work());

    }

    private Engineer createMockEngineer() {
        return new EngineerBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .build();
    }

    private Pilot createMockPilot() {
        return new PilotBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .build();
    }
}