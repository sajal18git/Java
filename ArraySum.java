package com.bridgelabz;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {4,2, 6, 8, 3, 9, 6, 10, 12};
        int target = 12;
        for (int i=0; i< numbers.length; i++) {
            for(int j=i+1; j< numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) ;
                System.out.println("pairs = " + (numbers[i] + numbers[j]));
            }
        }

    }
}
