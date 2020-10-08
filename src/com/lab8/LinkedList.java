package com.lab8;

public class LinkedList {

    private Node first;

    public static class Node {
        public Node next;
        public Object data;

        public Node(Node next, Object data) {
            this.next = next;
            this.data = data;
        }
    }

    public LinkedList() {
        this.first = null;
    }

    public void add(Object data) {
        this.first = new LinkedList.Node(first, data);
    }

    public int containsInteger(Integer i) {
        Node current = this.first;
        int count = 0;
        while (current != null) {
            if (current.data instanceof Integer && i.equals((Integer) current.data)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public void printActions(String s) {
        Node current = this.first;
        while (current != null) {
            if (s == null) {
                System.out.println(current.data);
            }
            else {
                if (((BankAccountMonitored.Action)current.data).getAct().compareTo(s) == 0 ) {
                    System.out.println(current.data);
                }
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {

        // Create new Linked List
        LinkedList linkedList = new LinkedList();

        // Add 5 elements into the linked list
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(3);

        // Print how many times it contains 3
        System.out.println(linkedList.containsInteger(3));

    }
}
