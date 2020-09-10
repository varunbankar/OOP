package com.lab4;

public class Banking {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Parent Name", "Parent Home", 5000);
        BankAccount ba2 = new BankAccount("My Name", "AH3", 2000);

        System.out.println("New Accounts");
        System.out.println(ba2.toString());

        ba1.withdraw(500);
        ba2.withdraw(500);

        System.out.println("\nPost Withdrawal");
        System.out.println(ba2.toString());

        ba1.deposit(1000);
        ba2.deposit(1000);

        System.out.println("\nPost Deposit");
        System.out.println(ba2.toString());

        ba1.transfer(ba2,1000);

        System.out.println("\nPost transfer from ba1 to ba2 of amount 1000");
        System.out.println(ba2.toString());

    }
}
