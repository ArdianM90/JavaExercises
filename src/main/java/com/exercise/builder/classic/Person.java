package com.exercise.builder.classic;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Person {

    private final String name;
    private final String lastName;
    private final int age;
    private final String profession;
    private final List<String> hobbies;

    public static class Builder {

        private final String name;
        private final String lastName;
        private int age;
        private String profession;
        private List<String> hobbies = new ArrayList<>();

        public Builder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be smaller than 0");
            }
            this.age = age;
            return this;
        }

        public Builder profession(String profession) {
            if (profession == null) {
                throw new IllegalArgumentException("Profession cannot be empty");
            }
            this.profession = profession;
            return this;
        }

        public Builder addHobby(String hobby) {
            if (hobby == null || hobby.isEmpty()) {
                throw new IllegalArgumentException("Hobby cannot be empty");
            }
            this.hobbies.add(hobby);
            return this;
        }

        public Person build() {
            return new Person(name, lastName, age, profession, hobbies);
        }
    }
}
