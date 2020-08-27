package com.lab2;

import java.util.Scanner;

public class TestFraction{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter numerator and denominator: ");;
		
		int num = input.nextInt();
		int denom = input.nextInt();
		
		while(denom==0)
		{
			System.out.println("Please enter a non-zero denominator: ");
			denom = input.nextInt();
		}
		
		
		Fraction f1 = new Fraction(num,denom);
		//f1.print();

		System.out.println("Please enter operator: ");

		char op = input.next().charAt(0);

		System.out.print("Please enter next numerator and denominator: ");;
		
		num = input.nextInt();
		denom = input.nextInt();
		
		while(denom==0)
		{
			System.out.println("Please enter a non-zero denominator: ");
			denom = input.nextInt();
		}
		
		
		Fraction f2 = new Fraction(num,denom);
		//f2.print();

		switch(op)
        {
            case '+':
            {
                f1.addFraction(f2);
                break;
            }
            case '-':
            {
                f1.subtractFraction(f2);
                break;
            }
            case '*':
            {
                f1.multiplyFraction(f2);
                break;
            }
            case '/':
            {
                f1.divideFraction(f2);
                break;
            }
            default:
            {
				System.out.println("Incorrect operator.");
				op = input.next().charAt(0);
            }
		}
		
		System.out.print("Updated fraction: ");
		f1.print();

		input.close();
	}
}
