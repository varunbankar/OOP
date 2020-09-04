package com.practice;

public class Finder {

    public int findMinimumElement(int[] input) {
        //Write a function to find the minimum element in the array
        int min = 2147483647;
        for (int i : input) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
