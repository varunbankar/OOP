package com.lab5;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private int month;

    public SavingsAccount(double balance, String name, String address, double interestRate) {
        super(balance, name, address);
        if (interestRate < 0 || interestRate > 100) throw new IllegalArgumentException();
        this.interestRate = interestRate;
        this.month = 0;
    }

    public void addInterest() {
        this.balance += balance * (interestRate / 100);
        this.month++;
    }

}
