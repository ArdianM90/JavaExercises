package com.exercise.exams.kodilla.middle;

import com.exercise.exams.kodilla.middle.solutions.Book;
import com.exercise.exams.kodilla.middle.solutions.MessageLogger;
import com.exercise.exams.kodilla.middle.solutions.Pizza;
import com.exercise.exams.kodilla.middle.solutions.age.validator.AgeValidator;
import com.exercise.exams.kodilla.middle.solutions.age.validator.UserTooYoungExeption;
import com.exercise.exams.kodilla.middle.solutions.age.validator.WrongValue;
import com.exercise.exams.kodilla.middle.solutions.OddNumbersExterminator;

import java.util.*;
import java.util.stream.Collectors;

public class MiddleExamSummary {
    public void show() {
        //================================
        //Kodilla middle exam - odds number exterminator
        OddNumbersExterminator oddsExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        List<Integer> evenNumbers = oddsExterminator.exterminate(numbers);
        System.out.print("Should be only evens: ");
        System.out.println(evenNumbers);
        System.out.println();
        //================================
        //Kodilla middle exam - pizza builder
        List<String> ingredients = new ArrayList<>();
        ingredients.add("tomatoes");
        ingredients.add("cheese");
        Pizza newPizza = new Pizza.PizzaBuilder()
                .ingredient("tomatoes")
                .ingredient("cheese")
                .build();
        System.out.println(newPizza.getIngredients());
        System.out.println();
        //================================
        //Kodilla middle exam - Singleton implementation
        MessageLogger logger1 = MessageLogger.getInstance();
        MessageLogger logger2 = MessageLogger.getInstance();
        logger1.log("First log");
        System.out.println(logger1.getLastLog());
        logger1.log("Second log");
        System.out.println(logger1.getLastLog());
        System.out.println("Both loggers are equal: "+logger1.getLastLog().equals(logger2.getLastLog()));
        System.out.println();
        //================================
        //Kodilla middle exam - creating map of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Adam Eckel", "Thinking in Java", 2004));
        books.add(new Book("Scott Oaks", "Java Performance", 2009));
        books.add(new Book("Maurice Naftalin", "Java generics and collections", 2002));
        Map<String, Book> booksMap = new HashMap<>();
        for (Book book : books) {
            booksMap.put(book.getTitle(), book);
        }
        Set<String> titles = booksMap.keySet();
        System.out.println("All titles "+titles);
        System.out.println();
        //================================
        //Kodilla middle exam - average pubYear from books list
        OptionalDouble optionalAverage = books.stream()
                .map(b -> b.getPubYear())
                .mapToInt(i -> Integer.parseInt(i))
                .average();
        if (optionalAverage.isPresent()) {
            System.out.println("Average publication year: "+optionalAverage.getAsDouble());
        } else {
            System.out.println("Average can not be computed");
        }
        System.out.println();
        //================================
        //Kodilla middle exam - ageValidator
        AgeValidator validator = new AgeValidator();
        boolean result;
        try {
            result = validator.validate(-12);
        } catch (WrongValue | UserTooYoungExeption exception) {
            result = false;
        }
        System.out.println("Should be false: "+result);
        System.out.println();
        //================================
        //Kodilla middle exam - listing books issued before specific year by lambda
        List<String> titlesList = books.stream()
                .filter(b -> b.getPublicationYear() < 2005)
                .map(b -> b.getTitle())
                .collect(Collectors.toList());
        System.out.println(titles);
        System.out.println("Should be two titles: "+(titlesList.size() == 2));
        System.out.println();
        //================================
    }
}
