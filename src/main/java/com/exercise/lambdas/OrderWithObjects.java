package com.exercise.lambdas;

import java.util.List;

public class OrderWithObjects {
    private List<Item> items;

    public OrderWithObjects(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
