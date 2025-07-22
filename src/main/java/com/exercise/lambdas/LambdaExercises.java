package com.exercise.lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExercises {
    public static void main(String[] args) {
        //1
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("aa", 2.0, "NEW"));
        orders.add(new Order("aaa", 10.0, "PAID"));
        orders.add(new Order("aaaa", 10.0, "CANCELLED"));
        Map<String, Double> summary = calculateTotalAmountByStatus(orders);
        summary.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();

        //2
        String text = "Hello# World12 Hello! Kitty Cat kitty Kitty Adrian Adam";
        List<String> result = analyzeWordsFrequency(text);
        result.forEach(System.out::println);
        System.out.println();

        //3
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Adrian", "IT", 20000.0));
        employees.add(new Employee("Zenek", "IT", 16000.0));
        employees.add(new Employee("Adam", "Support", 12000.0));
        employees.add(new Employee("Iwona", "HR", 8000.0));
        employees.add(new Employee("Iwona", "HR", 7000.0));
        Map<String, Double> avgSallary = averageSalaryByDepartment(employees);
        avgSallary.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();

        //4
        List<String> sentences = Arrays.asList(
                "Hello world!",
                "Hello again, world.",
                "World of Java."
        );
        System.out.println(mostFrequentWord(sentences));
        System.out.println();

        //5
        List<Product> products = List.of(
                new Product("Laptop", 1200.0, true),
                new Product("Mouse", 25.0, true),
                new Product("Keyboard", 45.0, false),
                new Product("USB cable", 10.0, true),
                new Product("Charger", 30.0, true)
        );
        List<String> filteredProducts = filterAndSortProducts(products);
        filteredProducts.forEach(System.out::println);
        System.out.println();

        //6
        List<Purchase> purchases = List.of(
                new Purchase("Alice", 120.0),
                new Purchase("Bob", 80.0),
                new Purchase("Alice", 30.0),
                new Purchase("Charlie", 100.0),
                new Purchase("David", 200.0),
                new Purchase("Charlie", 50.0),
                new Purchase("Adrian", 1000.0)
        );
        top3Customers(purchases).forEach(System.out::println);
        System.out.println();

        //7
        List<ItemizedOrder> myOrders = List.of(
                new ItemizedOrder("1", List.of(
                        new Item("Keyboard", 2),
                        new Item("Mouse", 1)
                )),
                new ItemizedOrder("2", List.of(
                        new Item("Keyboard", 1),
                        new Item("Monitor", 2)
                )),
                new ItemizedOrder("3", List.of(
                        new Item("Mouse", 4)
                ))
        );
        System.out.println(mostOrderedProduct(myOrders));
        System.out.println();

        //8
        List<User> users = List.of(
                new User("Anna", "ADMIN", true),
                new User("Zoe", "USER", true),
                new User("Adam", "ADMIN", true),
                new User("Marek", "USER", false),
                new User("Bartek", "USER", true),
                new User("Ola", "GUEST", true)
        );
        groupActiveUsersByRole(users).forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
            System.out.println();
        });
        System.out.println();

        //9.
        Customer alice = new Customer("Alice", List.of(
                new OrderWithList(List.of("apple", "banana")),
                new OrderWithList(List.of("banana", "carrot"))
        ));
        Customer bob = new Customer("Bob", List.of(
                new OrderWithList(List.of("apple", "date"))
        ));
        List<Customer> customers = List.of(alice, bob);
        getAllUniqueProducts(customers).forEach(System.out::println);
        System.out.println();

        //10.
        CustomerV2 adam = new CustomerV2("Alice", List.of(
                new OrderWithObjects(List.of(
                        new Item("apple", 2),
                        new Item("banana", 5)
                )),
                new OrderWithObjects(List.of(
                        new Item("banana", 3),
                        new Item("carrot", 1)
                ))
        ));
        CustomerV2 yoshi = new CustomerV2("Bob", List.of(
                new OrderWithObjects(List.of(
                        new Item("apple", 4),
                        new Item("banana", 1)
                ))
        ));
        List<CustomerV2> customersV2 = List.of(adam, yoshi);
        mostOrderedProductPerCustomer(customersV2).entrySet().forEach(System.out::println);
    }

    //1. lista zamówień na mapę - grupowanie i sortowanie
    public static Map<String, Double> calculateTotalAmountByStatus(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.summingDouble(Order::getAmount)));
    }

    //2. rozbijanie stringa po spacjach (same litery) i sortowanie malejąco wg. wystąpień
    public static List<String> analyzeWordsFrequency(String text) {
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split(" +");
        Map<String, Long> frequencyMap = Arrays.stream(words)
                .filter(w -> !w.isBlank())
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        return frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toList();
    }

    //3. lista pracowników na mapę płac - grupowanie i sortowanie
    public static Map<String, Double> averageSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }

    //4. najczęstsze słowo
    public static String mostFrequentWord(List<String> sentences) {
        List<String> words = sentences.stream().flatMap(e ->
                Arrays.stream(e.toLowerCase()
                        .replaceAll("[^a-z ]", "")
                        .split(" +"))
        ).toList();
        return words.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }

    //5. filtrowanie i sortowanie listy produktów
    public static List<String> filterAndSortProducts(List<Product> products) {
        return products.stream()
                .filter(e -> (e.isAvailable() && e.getPrice() < 100.0))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .map(Product::getName)
                .toList();
    }

    //6. top 3 klientów
    public static List<String> top3Customers(List<Purchase> purchases) {
        return purchases.stream()
                .collect(Collectors.groupingBy(Purchase::getCustomerName, Collectors.summingDouble(Purchase::getAmount)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(3)
                .toList();
    }

    //7. najczęsciej kupowany produkt (zagnieżdżone obiekty)
    public static String mostOrderedProduct(List<ItemizedOrder> orders) {
        return orders.stream()
                .map(ItemizedOrder::getItems)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Item::getProductName, Collectors.summingDouble(Item::getQuantity)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }

    //8. grupowanie, filtrowanie i sortowanie Userów
    public static Map<String, List<String>> groupActiveUsersByRole(List<User> users) {
        return users.stream()
                .filter(User::isActive)
                .collect(Collectors.groupingBy(User::getRole, Collectors.toList())).entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().stream()
                        .map(User::getName)
                        .sorted()
                        .toList())
                );
    }

    //9. zbiór unikalnych nazw produktów zamówionych przez wszystkich klientów.
    public static Set<String> getAllUniqueProducts(List<Customer> customers) {
        return customers.stream()
                .flatMap(e -> e.getOrders().stream())
                .flatMap(e -> e.getProducts().stream())
                .collect(Collectors.toSet());
    }

    //10.
    public static Map<String, String> mostOrderedProductPerCustomer(List<CustomerV2> customers) {
        return customers.stream().collect(Collectors.toMap(
                CustomerV2::getName,
                customer -> customer.getOrders().stream()
                        .flatMap(order -> order.getItems().stream())
                        .collect(Collectors.groupingBy(
                                Item::getProductName,
                                Collectors.summingInt(Item::getQuantity)
                        ))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse("")
        ));
    }
}