package com.exercise.lambdas;

import java.util.List;

public class CustomerV2 {
    private String name;
    private List<OrderWithObjects> orders;

    public CustomerV2(String name, List<OrderWithObjects> orders) {
        this.name = name;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderWithObjects> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderWithObjects> orders) {
        this.orders = orders;
    }
}
