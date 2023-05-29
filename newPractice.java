package com.bridgelabz;

public class newPractice {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            int num2 = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    num2 = num2 + 1;
                }
            }
            if (num2 == 0) {
                System.out.println(i);

            }
        }
    }
}


