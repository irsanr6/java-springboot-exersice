package com.irsan.javaexercise.iseng;

public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        return true;
    }

    public double makePayment(double amount) {
        return amount;
    }
}

class PredatoryCreditCard {
    private double apr;
    
}
