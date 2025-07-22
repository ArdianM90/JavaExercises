package com.exercise.testdome.lamdas;

import java.util.Comparator;
import java.util.List;

public class UserStatsProcessor {

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("alice", 150),
                new User("bob", 180),
                new User("charlie", 150),
                new User("dan", 120)
        );

        List<String> top = UserStatsProcessor.getTopUsers(users, 3);
        top.forEach(System.out::println);
    }

    public static List<String> getTopUsers(List<User> users, int limit) {
        return users.stream()
                .sorted(Comparator
                        .comparingInt(User::getPoints).reversed()
                        .thenComparing(User::getUsername))
                .map(User::getUsername)
                .limit(limit)
                .toList();
    }
}
