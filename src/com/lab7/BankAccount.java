package com.lab7;

import java.io.Serializable;

public abstract class BankAccount implements ITRules, Comparable, Serializable {

    protected double balance;
    protected String name;
    protected String address;
    protected double taxDeducted;

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

    @Override
    public double calculateTax(double taxableIncome) {
        double tax = 0;
        if (taxableIncome > TAX_SLAB_4) {
            tax = taxableIncome * (TAX_RATE_4 / 100);
        }
        else if (taxableIncome > TAX_SLAB_3) {
            tax = taxableIncome * (TAX_RATE_3 / 100);
        }
        else if (taxableIncome > TAX_SLAB_2) {
            tax = taxableIncome * (TAX_RATE_2 / 100);
        }
        else if (taxableIncome > TAX_SLAB_1) {
            tax = taxableIncome * (TAX_RATE_1 / 100);
        }
        return tax;
    }

    @Override
    public int compareTo(Object o) {
        BankAccount other = (BankAccount)o;
        return Double.compare(this.balance, other.balance);
    }

}
