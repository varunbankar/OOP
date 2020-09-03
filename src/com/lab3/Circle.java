package com.lab3;

/**
 * Create a circle which has a center
 * and radius.
 * */
public class Circle {

    // Instance variables
    private int x;
    private int y;
    private int radius;

    // Class constant
    public static final double PI = 3.14;

    /**
     * Constructor with 3 arguments to set center and radius value.
     * */
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Constructor with 2 arguments to set the center and radius defaults to 0.
     * */
    public Circle(int x, int y) {
        this(x, y, 0);
    }

    /**
     * Constructor with NO arguments where center and radius both defaults to (0,0) and 0.
     * */
    public Circle() {
        this(0,0,0);
    }

    /**
     * Set the x coordinate of center of the circle.
     * */
    private void setX(int x) {
        this.x = x;
    }

    /**
     * Set the y coordinate of center of the circle.
     * */
    private void setY(int y) {
        this.y = y;
    }

    /**
     * Get the x coordinate of center of the circle.
     * */
    private int getX() {
        return this.x;
    }

    /**
     * Get the y coordinate of center of the circle.
     * */
    private int getY() {
        return this.y;
    }

    /**
     * Set the radius of the circle.
     * */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Set the radius value of the circle.
     * */
    public int getRadius() {
        return this.radius;
    }

    /**
     * Set the center of the circle.
     * */
    public void setCenter(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     * Print the center of the circle.
     * */
    public void printCenter() {
        System.out.print("X-Coordinate=" + this.getX() + ", Y-Coordinate=" + this.getY() + ", ");
    }

    /**
     * Translate the circle on x-y plane.
     * */
    public void translate(int a, int b) {
        this.setX(this.getX() + a);
        this.setY(this.getY() + b);
    }

    /**
     * Get the area of the circle.
     * */
    public double area() {
        return PI * this.getRadius() * this.getRadius();
    }

}
