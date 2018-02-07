package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        String test = s.nextLine();
        System.out.print(test);
        for(int i =0; i<10; i++)
        {
            System.out.println("Test int " + i);
        }

    }

}
