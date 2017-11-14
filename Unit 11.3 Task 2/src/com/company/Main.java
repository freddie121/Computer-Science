package com.company;

import java.util.Scanner;

public class Main {

    public static String getPword(int attempt){
        Scanner s = new Scanner(System.in);
        String pass;
        if(attempt == 1){
            System.out.println("Enter your new password");
            pass = s.nextLine();
            while(pass.length() > 8 || pass.length() < 6 ){
                // System.out.println(pass.length());
                System.out.println("Error - Please enter a password between 6 and 8 characters");
                pass = s.nextLine();
            }
        }
        else
        {
            System.out.println("Please Re-enter your new password");
            pass = s.nextLine();
        }
        return pass;
    }
    public static void main(String[] args) {
       String password1 = getPword(1);
       // System.out.println(password1);
       String password2 = getPword(2);
       // System.out.println(password2);

        while(!(password1.equals(password2))){
            System.out.println("Error - Passwords do not match");
            password1 = getPword(1);
           // System.out.println(password1);
            password2 = getPword(2);
           // System.out.println(password2);
        }
        System.out.println("Password set.");
    }
}
