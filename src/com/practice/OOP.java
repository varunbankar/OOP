package com.practice;

public class OOP {
    public int x = 5;

    static {
        OOP oop = new OOP();
        System.out.println(oop.x);
    }

    public static void main(String[] args) {
        System.out.println(oop.x); // Error doesn't have access
    }

}
