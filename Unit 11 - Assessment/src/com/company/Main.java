package com.company;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static String answerYorN(){
        System.out.println("Enter your answer");
        String response = s.nextLine();
        response = response.toLowerCase();
        if(response == "y" || response == "n"){
            return response;
        }
        else{
            System.out.println("Incorrect");
            answerYorN();
        }
    }
    public static void main(String[] args) {
        String response = answerYorN();
        System.out.println(response);

    }
}
