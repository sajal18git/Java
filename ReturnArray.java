package com.bridgelabz;

public class ReturnArray {
    public static void main(String[] args) {
        int[] result = returnsArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println("Value is: " + result[i]);
        }
    }

    public static int[] returnsArray() {
        int[] myArr = new int[]{10, 20, 30, 40, 50};
        return myArr;
    }
}

