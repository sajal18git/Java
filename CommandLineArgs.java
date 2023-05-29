package com.bridgelabz;

public class CommandLineArgs {
    public static void main(String[] args) {
        int x ,y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
//        for (int i=0; i<args.length; i++) {

            System.out.println(x+y);
        }
    }

