package com.company;

public class Main {
    //Checks which play got the most votes (used ints as is easier to test)
    public static void playVote (int a, int b, int c) {
        // checks if either play has a distinct maximum number of votes
        if (a > b && a > c) {
            System.out.println("Play A");
        } else if (b > a && b > c) {
            System.out.println("Play B");
        } else if (c > a && c > b) {
            System.out.println("Play C");
        }
        else
        {
            //Checks if any of the values are joint highest if there is no distinct maximums
            if(a == b && a == c){
                System.out.println("Play A, B and C");
            }
            else if(a == b){
                System.out.println("Play A and B");
            }
            else{
                System.out.println("Play B and C");
            }
        }
    }

    public static void main(String[] args) {
        //calls the subroutine
	    playVote(2,1,1);
    }
}
