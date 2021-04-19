package com.exercise.exams.kodilla.middle.solutions.age.validator;

public class AgeValidator {
    public boolean validate(int age) throws WrongValue, UserTooYoungExeption {
        if (age < 1 || age > 150) {
            throw new WrongValue();
        } else if (age < 18) {
            throw new UserTooYoungExeption();
        }
        return true;
    }
}
