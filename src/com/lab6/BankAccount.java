package com.lab6;

public class BankAccount {

    private double balance;
    private Long accNo;
    private int numberOfTransactions;
    private LastTransaction lastTran;
    private PersonalDetails holder;

    private static final double MIN_BALANCE = 1000;
    private static Long nextAccNo = 1800201311L;

    public BankAccount(String name, String address, double balance) {
        if (balance < MIN_BALANCE) {
            throw new IllegalArgumentException("Need balance more than " + MIN_BALANCE + " to create an account.");
        }
        this.holder = new PersonalDetails(name, address);
        this.accNo = nextAccNo++;
        this.balance = balance;
        this.numberOfTransactions = 0;
        this.lastTran = new LastTransaction();
    }

    public boolean deposit(double amount) {
        if (amount < 0) return false;
        this.balance += amount;
        this.numberOfTransactions++;
        this.lastTran.setType("Deposit");
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || balance < amount + MIN_BALANCE) return false;
        this.balance -= amount;
        this.numberOfTransactions++;
        this.lastTran.setType("Withdraw");
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
        this.lastTran.setType("Transfer");
        other.lastTran.setType("Transfer");
    }

    @Override
    public String toString() {
        return "Account No.: " + this.accNo + " | " + this.holder +" | Last Transaction: " + this.lastTran;
    }

}
