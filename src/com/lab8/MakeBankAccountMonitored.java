package com.lab8;

public class MakeBankAccountMonitored {
    public static void main(String[] args) {

        // Create new Bank Account Monitored
        BankAccountMonitored bankAccountMonitored = new BankAccountMonitored(5000, "Client A", "Address A");

        // Perform few actions
        bankAccountMonitored.deposit(300);
        bankAccountMonitored.withdraw(900);
        bankAccountMonitored.deposit(400);
        bankAccountMonitored.deposit(500);
        bankAccountMonitored.withdraw(800);
        bankAccountMonitored.deposit(600);
        bankAccountMonitored.withdraw(700);

        // Print All Actions
        bankAccountMonitored.printAllActions();
        System.out.println();

        // Print Deposit Actions
        bankAccountMonitored.printDepositActions();
        System.out.println();

        // Print Withdraw Actions
        bankAccountMonitored.printWithdrawActions();
        System.out.println();

    }
}
