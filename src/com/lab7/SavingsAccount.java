package com.lab7;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private int month;

    public SavingsAccount(double balance, String name, String address, double interestRate) {
        super(balance, name, address);
        if (interestRate < 0 || interestRate > 100) throw new IllegalArgumentException();
        this.interestRate = interestRate;
        this.month = 0;
        this.taxDeducted = 0;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        double taxOnInterest = this.calculateTax(interest);
        this.balance += interest - taxOnInterest;
        this.taxDeducted += taxOnInterest;
        this.month++;
    }

}
