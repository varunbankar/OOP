package com.lab1;

import java.util.Scanner;


/**
 * Takes number of students as an input, then record their marks.
 * Subsequently, prints out the highest scorer and percentage of each student relative
 * to the highest scorer.
 */
public class StudentMarks {
    public static void main(String[] args) {
        // Instantiate a Scanner object
        Scanner input = new Scanner(System.in);

        // Num of students
        int studentNum = input.nextInt();

        // Marks arrays
        double[] marks =new double[studentNum];


        // Record marks from the input
        for (int i = 0; i < studentNum; i++) {
            marks[i] = input.nextDouble();
        }

        // Highest marks
        double maxMark = 0;
        for(double mark: marks) {
            if (mark > maxMark) maxMark = mark;
        }

        // Print out highest mark
        System.out.println("Highest is "+ maxMark);


        System.out.println("Marks as percentage");
        for(double mark: marks) {
            System.out.println((int)((mark/maxMark) * 100));
        }

        // Closes the scanner
        input.close();
    }
}
