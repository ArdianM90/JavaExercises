package com.exercise.builder.classic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassicBuilderTestSuite {

    @Test
    public void shouldCreatePersonByBuilder() {
        // given & when
        Person person = new Person.Builder("John", "Doe")
                .age(20)
                .profession("Engineer")
                .addHobby("Fishing")
                .addHobby("Games")
                .addHobby("Football")
                .build();

        // then
        assertEquals("John", person.getName());
        assertEquals("Doe", person.getLastName());
        assertEquals("Engineer", person.getProfession());
        assertEquals(3, person.getHobbies().size());
    }
}