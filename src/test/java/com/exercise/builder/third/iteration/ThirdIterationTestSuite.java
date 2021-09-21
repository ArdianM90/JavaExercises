package com.exercise.builder.third.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdIterationTestSuite {
    @Test
    public void shouldCreateProperEngineerViaBuilder() {
        // given & when
        Engineer engineer = createMockEngineer();

        // then
        assertEquals("John", engineer.getName());
        assertEquals(200.0, engineer.getSalary());
        assertEquals(2, engineer.getDuties().size());
        assertEquals("wrenches", engineer.getTools());
    }

    @Test
    public void shouldCreateProperPilotViaBuilder() {
        // given & when
        Pilot pilot = createMockPilot();

        // then
        assertEquals("John", pilot.getName());
        assertEquals(200.0, pilot.getSalary());
        assertEquals(2, pilot.getDuties().size());
        assertEquals("ENG", pilot.getLanguage());
    }

    private Engineer createMockEngineer() {
        return new EngineerBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .tools("wrenches")
                .build();
    }

    private Pilot createMockPilot() {
        return new PilotBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .language("ENG")
                .build();
    }
}