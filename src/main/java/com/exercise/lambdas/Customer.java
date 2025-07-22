package com.exercise.lambdas;

import java.util.List;

public class Customer {
    private String name;
    private List<OrderWithList> orders;

    public Customer(String name, List<OrderWithList> orders) {
        this.name = name;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderWithList> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderWithList> orders) {
        this.orders = orders;
    }
}
