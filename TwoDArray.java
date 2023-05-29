package com.bridgelabz;

public class TwoDArray {
    public static void main(String[] args) {
//      int [][] arrayName = new data type [Row][Col];
//        int [][] arr = {{ },{ }, { }};
        int [][] arr = {{1,2,3},{4,5,6}, {7,8,9}};
//               System.out.println(arr[0][2]);  //System.out.println(arr[R][C]);
        for (int i=0; i<= arr.length-1; i++) {
            for ( int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
