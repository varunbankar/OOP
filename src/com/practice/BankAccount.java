package com.practice;

public class BankAccount {

    private double balance;
    private final Long accNo;
    private int numberOfTransactions;

    private static final double MIN_BALANCE = 100;
    private static Long nextAccNo = 1800201311L;

    public BankAccount(double balance) {
        if (balance < MIN_BALANCE) {
            throw new IllegalArgumentException("Need balance more than " + MIN_BALANCE + " to create an account.");
        }
        this.accNo = nextAccNo++;
        this.balance = balance;
        this.numberOfTransactions = 0;
    }

    public boolean deposit(double amount) {
        if (amount < 0) return false;
        this.balance += amount;
        this.numberOfTransactions++;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || balance < amount + MIN_BALANCE ) return false;
        this.balance -= amount;
        this.numberOfTransactions++;
        return true;
    }

    public double getBalance() {
        return this.balance;
    }

    public void transfer(BankAccount other, double amount) {
        boolean withdraw = this.withdraw(amount);
        if (withdraw) {
            boolean deposit = other.deposit(amount);
        }
    }

    public void print() {
        System.out.println("Account No.: " + this.accNo + " | Balance: " + this.balance + " | No. Of Transactions: " + this.numberOfTransactions);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100);
        BankAccount ba2 = new BankAccount(100);
        ba1.print();
        ba2.print();

        ba1.deposit(100);
        ba2.deposit(250);
        ba1.print();
        ba2.print();

        ba1.withdraw(50);
        ba2.withdraw(75);
        ba1.print();
        ba2.print();

        ba2.transfer(ba1, 100);
        ba1.print();
        ba2.print();
    }

}
