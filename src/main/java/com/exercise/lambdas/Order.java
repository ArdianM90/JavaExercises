package com.exercise.lambdas;

public class Order {
    private String orderId;
    private double amount;
    private String status;

    public Order(String orderId, double amount, String status) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
