package com.lab7;

public class CheckingAccount extends BankAccount {

    private int transactionCount;
    private final int FREE_TRANSACTIONS = 10;
    private final double TRANSACTION_FEE = 2;

    public CheckingAccount(double balance, String name, String address) {
        super(balance, name, address);
        this.transactionCount = 0;
        this.taxDeducted = 0;
    }

    private void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            this.balance -= TRANSACTION_FEE;
            this.transactionCount = 0;
        }
    }

    @Override
    public boolean deposit(double amount) {
        if(super.deposit(amount)) {
            this.transactionCount++;
            this.deductFees();
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if(super.withdraw(amount)) {
            this.transactionCount++;
            this.deductFees();
        }
        return false;
    }
}
