package com.lab9;

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


        // Print All Withdrawals
        bankAccountMonitored.printAllWithdrawals();
        System.out.println();

        // Print All Deposits
        bankAccountMonitored.printAllDeposits();
        System.out.println();

        // Print 1 2 1
        bankAccountMonitored.print121();
        System.out.println();

        // Remove with tid 3 and print all actions to see if tid 3 is removed.
        bankAccountMonitored.removeAction(3);
        bankAccountMonitored.printAllActions();

    }
}
