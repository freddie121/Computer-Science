package com.company;

import java.util.Scanner;

public class Main {

    public static void multiples(int table, int startNum, int endNum, String pupilName){
        System.out.println("Hi, " + pupilName + " ... here is your times table:");
        for(int i = startNum; i <= endNum; i++)
        {
            System.out.println(table + " X " + i + " = " + table*i);

        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    System.out.println("What's your name?");
	    String name = s.nextLine();
	    System.out.println("Enter the times table");
	    int table = s.nextInt();
        System.out.println("Enter the start number");
        int startNum = s.nextInt();
        System.out.println("Enter the end number");
        int endNum = s.nextInt();
        multiples(table, startNum,endNum,name);

    }

}
