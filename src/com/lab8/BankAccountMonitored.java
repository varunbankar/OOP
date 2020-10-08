package com.lab8;

public class BankAccountMonitored extends BankAccount {

    private LinkedList recentActions;

    public class Action {
        private String act;
        private long amount;

        public Action(String act, long amount) {
            this.act = act;
            this.amount = amount;
        }

        public String getAct() {
            return this.act;
        }

        @Override
        public String toString() {
            return this.act + " | " + this.amount;
        }

    }

    public BankAccountMonitored(double balance, String name, String address) {
        super(balance, name, address);
        this.recentActions = new LinkedList();
    }

    @Override
    public boolean deposit(double amount) {
        if (super.deposit(amount)) {
            this.recentActions.add(new Action("deposit", (long) amount));
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)) {
            this.recentActions.add(new Action("withdraw", (long) amount));
            return true;
        }
        return false;
    }

    public void printAllActions() {
        this.recentActions.printActions(null);
    }

    public void printDepositActions() {
        this.recentActions.printActions("deposit");
    }

    public void printWithdrawActions() {
        this.recentActions.printActions("withdraw");
    }

}
