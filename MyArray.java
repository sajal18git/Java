package com.bridgelabz;

public class MyArray {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int count = 1;
        int sum = 0;
//    datatype[] arrayName = new datatype[size]; // size is nothing but no of elements
//        int rollNo1 = 12;
//        int rollNo2 = 13;
//        int[] rollNo = {12,13,14,15,16};
        myArray[0] = 12;
        myArray[1] = 13;
        myArray[2] = 14;
        myArray[3] = 15;
        myArray[4] = 16;
//        System.out.println(myArray[0]);
//        System.out.println(myArray[4]);
//        System.out.println(myArray[myArray.length-1]); //to find elements from last // length=total no of elements/size which is here 5
//        System.out.println(Arrays.toString(myArray));
//        for (int i=0; i<=myArray.length-1; i++ ) {
//            System.out.println(myArray[i]);
//            for (int a:myArray) {
//                System.out.println(a);
//                if (a%2 == 0) {
//                    System.out.println(a);
        for (int a = 0; a <= myArray.length - 1; a++) {
//            if (a%2 == 0) {
            sum += a;
            sum = sum + a;
            count = a;
        }
            System.out.println("Total count=" + count);
            System.out.println("Total sum=" + sum);
        }
    }

