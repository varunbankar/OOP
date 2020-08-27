package com.lab2;


/**
 * Creates a Fraction object and stores the numerator and denominator in their lowest form.
 * This also has methods to add, subtract, multiply, divide other Fraction
 * from it.
 */
public class Fraction {

    private int num, denom;

    // Constructor
    public Fraction() {
        this(0, 1);
    }

    public Fraction(int n) {
        this(n, 1);
    }

    public Fraction(int p, int q) {
        num = p;
        denom = q;
        reduce();
    }

    public Fraction(Fraction other) {
        this(other.num, other.denom);
    }

    /**
     * Method to reduce the fraction to it lowest form
     */
    private void reduce() {

        int gcd = gcd(num, denom);

        num = num / gcd;
        denom = denom / gcd;

    }

    /**
     * Recursively find GCD of two numbers - used by reduce method
     */
    private int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    /**
     * Get the numerator of the Fraction
     */
    public int getNum() {
        return this.num;
    }

    /**
     * Get the denominator of the Fraction
     */
    public int getDenom() {
        return this.denom;
    }

    /**
     * Set the numerator of the Fraction
     */
    public void setNum(int newNum) {
        this.num = newNum;
        reduce();
    }

    /**
     * Set the denominator of the fraction
     */
    public void setDenom(int newDenom) {
        if (newDenom == 0) throw new IllegalArgumentException();
        this.denom = newDenom;
        reduce();
    }

    /**
     * Add Fraction with other Fraction
     */
    public void addFraction(Fraction other) {
        arithmeticOperation(other, '+');
    }

    /**
     * Subtract Fraction with other Fraction
     */
    public void subtractFraction(Fraction other) {
        arithmeticOperation(other, '-');
    }

    /**
     * Mulitply Fraction with other Fraction
     */
    public void multiplyFraction(Fraction other) {
        arithmeticOperation(other, '*');
    }

    /**
     * Divide Fraction with other Fraction
     */
    public void divideFraction(Fraction other) {
        arithmeticOperation(other, '/');
    }

    /**
     * Private method to perform arithmetic operations with Fractions. Increases code reusability.
     * */
    private void arithmeticOperation(Fraction other, char operation) {

        switch (operation) {
            case '+':
                this.num = (this.num * other.denom) + (other.num * this.denom);
                this.denom = this.denom * other.denom;
                break;
            case '-':
                this.num = (this.num * other.denom) - (other.num * this.denom);
                this.denom = this.denom * other.denom;
                break;
            case '*':
                this.num = this.num * other.num;
                this.denom = this.denom * other.denom;
                this.print();
                break;
            case '/':
                this.num = this.num * other.denom;
                this.denom = this.denom * other.num;
                break;
        }

        reduce();
    }

    /**
     * Prints the numerator and denominator of the Franction
     * */
    public void print() {
        System.out.print(this.num + " " + this.denom);
    }

}
