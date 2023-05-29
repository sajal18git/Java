package com.bridgelabz;

public class SumOfOddEven {
    public static void main(String[] args) {
        int n= 50;
        int sum= 0;
        for (int i=0; i<=n; i++) {
            if (i % 2 == 1) { // i % 2 == 0 and for odd i % 2 == 1
                sum = sum + i;
            }
        }
            System.out.println(sum);

    }
}
