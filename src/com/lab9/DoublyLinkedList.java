package com.lab9;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public static class Node {
        public Node next;
        public Node prev;
        public Object data;

        public Node(Node next, Node prev, Object data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = new Node(null, null, null);
        this.tail = new Node(null, null, null);
        this.tail.prev = this.head;
        this.head.next = this.tail;
    }

    public void insertBetween(Node next, Node prev, Object data) {
        Node newNode = new Node(next, prev, data);
        next.prev = newNode;
        prev.next = newNode;
    }

    public void insertLast(Object data) {
        this.insertBetween(this.tail, this.tail.prev, data);
    }

    public void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public Node getHead() {
        return this.head;
    }

}
