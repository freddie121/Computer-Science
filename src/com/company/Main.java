package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
// Declaring the quiz as a 2D array to have the questions and answers together
static String[][] quiz = new String[10][5];
// Scanner allows inputs to be read
static Scanner s = new Scanner(System.in);
// Declaring an array so the creator can assign which answer is correct
static int[] answers = new int[10];
// To generate a random number (not important for the algorithm but useful to test)
static Random rand = new Random();
    //easiest way to populate array in java
    public static void populateArrays(){
            for (int i = 0; i <= 9; i++) {
                quiz[i][0] = "Q" + Integer.toString(i);
                quiz[i][1] = "A1";
                quiz[i][2] = "A2";
                quiz[i][3] = "A3";
                quiz[i][4] = "A4";
                answers[i] = rand.nextInt(5);
            }
    }
    // Subroutine to run the quiz
    public static void runQuiz(){
        int correctAnswers = 0;
        //Iterates for each question in the quiz
        for(int i = 0; i <=9; i++){
            System.out.println("Question number " + i + ": " + quiz[i][0]);
            System.out.println("1. " + quiz[i][1]);
            System.out.println("2. " + quiz[i][2]);
            System.out.println("3. " + quiz[i][3]);
            System.out.println("4. " + quiz[i][4]);
            System.out.println("Enter the number of your answer");
            int questionAnswer = s.nextInt();

            // Validates the answer number
            while(questionAnswer > 4 || questionAnswer < 1){
                System.out.println("Error, please enter a valid answer");
                questionAnswer = s.nextInt();
            }

            // Checks if the answer is correct
            if(answers[i] == questionAnswer){
                correctAnswers++;
            }
        }
        System.out.println("You got: " + correctAnswers + " answers correct");
    }

    public static void main(String[] args) {
	populateArrays();
	runQuiz();

    }
}
