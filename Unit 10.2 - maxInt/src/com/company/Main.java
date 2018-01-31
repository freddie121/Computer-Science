package com.company;

public class Main {
    // Finds the largest integer in the list
    public static int findMax(int[]listInt){
        int maxInt = 0;
        for(int i=0; i< listInt.length; i++ ){
            if(listInt[i] > maxInt){
                maxInt = listInt[i];
            }
        }
        return maxInt;
    }
    // Main program
    public static void main(String[] args) {
        int[] test = new int[0];
        System.out.print(findMax(test));
    }
}
