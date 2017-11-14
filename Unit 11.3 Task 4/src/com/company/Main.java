    package com.company;

    import java.awt.*;
    import java.util.Scanner;
    import java.util.Arrays;

    public class Main {
    static Scanner s;
    // Array 0-9,0-5
    static String[][] carPark = new String[10][6];
    // Subroutine to assigne the value "empty" to all values in the array
    public static void emptyCarpark() {
        int ii = 0;
        for (int i = 0; ii <= 5; i++) {
            if (i == 9) {
                carPark[i][ii] = "empty";
               // System.out.println(i);
        // System.out.println(ii);
        // System.out.println(carPark[i][ii]);
        i = 0;
        ii++;
    } else {
        carPark[i][ii] = "empty";
        // System.out.println(i);
        // System.out.println(ii);
        // System.out.println(carPark[i][ii]);
    }
    }
        System.out.println("Car park emptied");
                }
    public static void parkCar(){
        s = new Scanner(System.in);
        System.out.println("Enter your registration number");
        String reg = s.nextLine().toUpperCase();
        System.out.println("Enter the row for your car");
        int row = s.nextInt();
        while(row > 9 || row < 0){
            System.out.println("Error - Enter a row number less than 10");
            row = s.nextInt();
        }
        System.out.println("Enter the column for your car");
        int col = s.nextInt();
        while(col > 5 || col < 0){
            System.out.println("Error - Enter a column number less than 6");
            col = s.nextInt();
        }
        if(!carPark[row][col].equals("empty")) {
            System.out.println("Error - this car park space is already taken please choose a different space and try again");
        }
        else {
            carPark[row][col] = reg;
            System.out.println("Your car has been parked in " + row + "," + col);
        }
    }
    public static void removeCar(){
    boolean found = false;
    String reg;
    System.out.println("Enter your registration number");
    reg = s.nextLine();
    int ii = 0;
    for (int i = 0; ii <= 5; i++) {
        if(carPark[i][ii] == reg){
            carPark[i][ii] = "empty";
            System.out.println("Car removed from " + i + "," + ii);
            found = true;

        }

        if (i == 9) {
            // System.out.println(i);
            // System.out.println(ii);
            // System.out.println(carPark[i][ii]);
            i = 0;
            ii++;
        }
    }
    if(found == false){
        System.out.println("Error - Car not found");
    }
    }
    public static void displayGrid(){
        System.out.println(Arrays.deepToString(carPark));
    }
    public static void main(String[] args){
    // Main program
        // Shows the user the options and gets them to enter their option
        s = new Scanner(System.in);
        emptyCarpark();
        System.out.println("Enter the number of your choice");
        System.out.println("1. Reset all the spaces in the car park to 'empty'");
        System.out.println("2. Park a car");
        System.out.println("3. Remove a car");
        System.out.println("4. Display the car park grid");
        System.out.println("5. Quit");
        int choice = s.nextInt();
        // loop to see what option the user inputs
        while(choice != 5){
            if(choice <= 4 && choice >=1) {

                switch (choice) {
                    case 1:
                        emptyCarpark();
                        break;
                    case 2:
                        parkCar();
                        break;
                    case 3:
                        // there is an error with this method
                        removeCar();
                        break;
                    case 4:
                        displayGrid();
                        break;
                }
            }
            else
            {
                System.out.println("Error - Enter a valid number (1-5)");
            }
            System.out.println();
            System.out.println("Enter the number of your choice");
            System.out.println("1. Reset all the spaces in the car park to 'empty'");
            System.out.println("2. Park a car");
            System.out.println("3. Remove a car");
            System.out.println("4. Display the car park grid");
            System.out.println("5. Quit");
            choice = s.nextInt();
        }
    }
    }
