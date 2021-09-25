package com.exercise.builder.innerstatic.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerStaticIterationTestSuite {
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
        assertEquals(1, pilot.getDuties().size());
        assertEquals("ENG", pilot.getLanguage());
    }

    @Test
    public void shouldWorkMethodsBeDifferent() {
        // given & when
        Engineer engineer = createMockEngineer();
        Pilot pilot = createMockPilot();

        // then
        assertEquals("Implementing and testing...", engineer.work());
        assertEquals("Flying the plane...", pilot.work());
    }

    private Engineer createMockEngineer() {
        return new Engineer.Builder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .tools("wrenches")
                .build();
    }

    private Pilot createMockPilot() {
        return new Pilot.Builder()
                .name("John")
                .salary(200.0)
                .addDuty("flying")
                .language("ENG")
                .build();
    }
}