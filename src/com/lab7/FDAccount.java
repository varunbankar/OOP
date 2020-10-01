package com.lab7;

public class FDAccount extends BankAccount {

    private int transactionCount;
    private final int MAX_TRANSACTIONS = 1;
    private int month;

    public FDAccount(double balance, String name, String address) {
        super(balance, name, address);
        this.transactionCount = 0;
        this.month = 0;
        this.taxDeducted = 0;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public boolean deposit(double amount) {
        if (this.transactionCount < this.MAX_TRANSACTIONS) {
            if (super.deposit(amount)) {
                this.transactionCount++;
                return true;
            }
        }
        return false;
    }

    public double getBalance() {
        double balanceWithInterest = 0;
        if (this.month <= 12) {
            balanceWithInterest = Math.pow(this.balance * 1.06, this.month);
        } else if (this.month <= 36) {
            balanceWithInterest = Math.pow(this.balance * 1.07, this.month);
        } else {
            balanceWithInterest = Math.pow(this.balance * 1.08, this.month);
        }
        return balanceWithInterest;
    }

}
