package com.lab5;

public class BankAccount {

    protected double balance;
    protected String name;
    protected String address;

    public BankAccount(double balance, String name, String address) {
        if (balance < 0) throw new IllegalArgumentException();
        this.balance = balance;
        this.name = name;
        this.address = address;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount < 0) return false;
        balance -= amount;
        return true;
    }

}
