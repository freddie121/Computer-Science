package com.company;
import java.util.Scanner;

public class Main {
    static String[] names = new String[10];
    static Scanner s = new Scanner(System.in);

    // Adds a name to the array at a specified position
    public static void addName(){
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter the space to enter your name into the list (0-9)");
        int slot = s.nextInt();
        while(slot > 9 || slot < 0){
            System.out.println("Error enter a value between 0-9 inclusive");
            s.nextInt();
        }
        names[slot] = name;
    }

    //prints the list
    public static void displayList(){
        for(int i=0; i <=9; i++){
            System.out.println(i + " " + names[i]);
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add name");
            System.out.println("2. Display list");
            System.out.println("3. Quit");
            System.out.println("Enter your choice");
            choice = s.nextInt();
            switch(choice){
                case 1: addName();
                        break;
                case 2: displayList();
                        break;
                case 3: System.out.println("Program terminating");
                        break;
                default: System.out.println("Error - Invalid choice");
                         break;
            }

        } while(choice != 3);
    }
}
