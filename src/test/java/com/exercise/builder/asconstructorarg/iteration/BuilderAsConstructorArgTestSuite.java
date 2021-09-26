package com.exercise.builder.asconstructorarg.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderAsConstructorArgTestSuite {
    @Test
    public void shouldCreateProperEngineerViaBuilder() {
        // given
        EngineerBuilder builder = new EngineerBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .tools("wrenches")
                .build();

        // when
        Engineer engineer = new Engineer(builder);

        // then
        assertEquals("John", engineer.getName());
        assertEquals(200.0, engineer.getSalary());
        assertEquals(2, engineer.getDuties().size());
        assertEquals("wrenches", engineer.getTools());
    }

    @Test
    public void shouldCreateProperPilotViaBuilder() {
        // given
        PilotBuilder builder = new PilotBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("flying")
                .language("ENG")
                .build();

        // when
        Pilot pilot = new Pilot(builder);

        // then
        assertEquals("John", pilot.getName());
        assertEquals(200.0, pilot.getSalary());
        assertEquals(1, pilot.getDuties().size());
        assertEquals("ENG", pilot.getLanguage());
    }

    @Test
    public void shouldWorkMethodsBeDifferent() {
        // given
        EngineerBuilder engineerBuilder = new EngineerBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("engineering")
                .addDuty("making money")
                .tools("wrenches")
                .build();
        PilotBuilder pilotBuilder = new PilotBuilder()
                .name("John")
                .salary(200.0)
                .addDuty("flying")
                .language("ENG")
                .build();

        // when
        Engineer engineer = new Engineer(engineerBuilder);
        Pilot pilot = new Pilot(pilotBuilder);

        // then
        assertEquals("Implementing and testing...", engineer.work());
        assertEquals("Flying the plane...", pilot.work());
    }
}