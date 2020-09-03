package com.lab3;

/**
 * Make use of Circle class and create
 * 3 circles by calling 3 different constructors.
 * Subsequently set the values of the circle
 * if already not set by the constructor.
 * Translate the circle and
 * print the properties of all 3 circles.
 * */
public class UseCircle {
    public static void main(String[] args) {

        // Circle with 3 arguments constructor
        Circle circleA = new Circle(1, 2, 4);

        // Circle with 2 arguments constructor
        Circle circleB = new Circle(2, 4);
        circleB.setRadius(1);

        // Circle with NO arguments constructor
        Circle circleC = new Circle();
        circleC.setCenter(4, 8);
        circleC.setRadius(16);

        // Translate circle C
        circleC.translate(4, 8);

        // Print out Circle A properties
        System.out.print("Circle A: ");
        circleA.printCenter();
        System.out.print("Radius: " + circleA.getRadius()+ ", ");
        System.out.print("Area: " + circleA.area() + '\n');

        // Print out Circle B properties
        System.out.print("Circle B: ");
        circleB.printCenter();
        System.out.print("Radius: " + circleB.getRadius()+ ", ");
        System.out.print("Area: " + circleB.area() + '\n');

        // Print out Circle C properties
        System.out.print("Circle C: ");
        circleC.printCenter();
        System.out.print("Radius: " + circleC.getRadius()+ ", ");
        System.out.print("Area: " + circleC.area() + '\n');

    }
}
