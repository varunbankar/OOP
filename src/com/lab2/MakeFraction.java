package com.lab2;

import java.util.Scanner;

/**
 * Takes numerator and denominator input from the user then create Fraction object.
 * Prints their reduced values.
 * */
public class MakeFraction {
    public static void main(String[] args) {

        // Instantiate a Scanner object
        Scanner input = new Scanner(System.in);

        // Get numerator and denominator
        int num = input.nextInt();
        int denom;
        do {
            denom = input.nextInt();
        } while (denom == 0);

        // Create Fraction object
        Fraction f = new Fraction();
        f.setNum(num);
        f.setDenom(denom);

        // Print out it's numerator and denominator in lowest form
        System.out.println("Numerator: " + f.getNum());
        System.out.println("Denominator: " + f.getDenom());

        // Close scanner
        input.close();

    }
}
