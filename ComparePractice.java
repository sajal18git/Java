package com.bridgelabz;

import java.util.Scanner;
public class ComparePractice {
    static int Aadhaar_number;
    static int Confirm_Aadhaar_number;

    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Aadhaar_number :");
        Aadhaar_number= obj.nextInt();
        System.out.println("Re-enter your Aadhaar_number :");
        Confirm_Aadhaar_number= obj.nextInt();
        if (Aadhaar_number==Confirm_Aadhaar_number) {
            System.out.println("Aadhaar number matched");
        }
            else {
            System.out.println("Aadhaar number does not matched");

            }
        }
    }

