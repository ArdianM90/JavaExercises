package com.exercise.lambdas;

import java.util.List;

public class OrderWithList {
    private List<String> products;

    public OrderWithList(List<String> products) {
        this.products = products;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
