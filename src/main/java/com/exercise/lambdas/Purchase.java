package com.exercise.lambdas;

public class Purchase {
    private String customerName;
    private double amount;

    public Purchase(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
