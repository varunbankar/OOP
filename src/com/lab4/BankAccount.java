package com.lab4;

public class BankAccount {

    private double balance;
    private Long accNo;
    private int numberOfTransactions;
    private String lastTran;
    private String name;
    private String address;

    private static final double MIN_BALANCE = 1000;
    private static Long nextAccNo = 1800201311L;

    public BankAccount(String name, String address, double balance) {
        if (balance < MIN_BALANCE) {
            throw new IllegalArgumentException("Need balance more than " + MIN_BALANCE + " to create an account.");
        }
        this.name = name;
        this.address = address;
        this.accNo = nextAccNo++;
        this.balance = balance;
        this.numberOfTransactions = 0;
    }

    public boolean deposit(double amount) {
        if (amount < 0) return false;
        this.balance += amount;
        this.numberOfTransactions++;
        this.lastTran = "Deposit";
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || balance < amount + MIN_BALANCE) return false;
        this.balance -= amount;
        this.numberOfTransactions++;
        this.lastTran = "Withdraw";
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
        this.lastTran = "Transfer";
        other.lastTran = "Transfer";
    }

    @Override
    public String toString() {
        return "Account No.: " + this.accNo + " | Name: " + this.name + " | Address: " + this.address + " | Last Transaction: " + this.lastTran;
    }

}
