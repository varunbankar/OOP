package com.lab9;

public class BankAccountMonitored extends BankAccount {

    private DoublyLinkedList recentActions;
    private static int tid = 1;

    public class Action {
        private String act;
        private long amount;
        private int tid;

        public Action(String act, long amount, int tid) {
            this.act = act;
            this.amount = amount;
            this.tid = tid;
        }

        public String getAct() {
            return this.act;
        }

        @Override
        public String toString() {
            return this.act + " | " + this.amount + " | " + this.tid;
        }

    }

    public BankAccountMonitored(double balance, String name, String address) {
        super(balance, name, address);
        this.recentActions = new DoublyLinkedList();
    }

    @Override
    public boolean deposit(double amount) {
        if (super.deposit(amount)) {
            this.recentActions.insertLast(new Action("deposit", (long) amount, tid++));
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)) {
            this.recentActions.insertLast(new Action("withdraw", (long) amount, tid++));
            return true;
        }
        return false;
    }

    public void printAllActions() {
        DoublyLinkedList.Node head = recentActions.getHead().next;
        while(head.next != null) {
            System.out.println((Action)head.data);
            head = head.next;
        }
    }

    public void printAllWithdrawals() {
        DoublyLinkedList.Node head = recentActions.getHead().next;
        while(head.next != null) {
            Action action = (Action)head.data;
            if (action.act.compareTo("withdraw") == 0) {
                System.out.println(action);
            }
            head = head.next;
        }
    }

    public void printAllDeposits() {
        DoublyLinkedList.Node head = recentActions.getHead().next;
        while(head.next != null) {
            Action action = (Action)head.data;
            if (action.act.compareTo("deposit") == 0) {
                System.out.println(action);
            }
            head = head.next;
        }
    }

    public void removeAction(int tid) {
        DoublyLinkedList.Node head = recentActions.getHead().next;
        while(head.next != null) {
            Action action = (Action)head.data;
            if (action.tid == tid) {
                recentActions.removeNode(head);
            }
            head = head.next;
        }
    }

    public void print121() {
        DoublyLinkedList.Node first = recentActions.getHead().next;
        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(first.data);
    }


}
