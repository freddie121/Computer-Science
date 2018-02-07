package com.company;

import java.awt.*;
import java.util.Arrays;

public class Main {
    // Subroutine to find whether a number of a list is divisible by 7
    public static int[] divideSeven (int[] inpInts){
        int noSeven = 0;
        int[] divSeven = new int[inpInts.length];
        for(int i = 0; i < inpInts.length; i++){
            if(inpInts[i] % 7 == 0){
                divSeven[noSeven] = inpInts[i];
                noSeven++;
            }
        }
        return divSeven;
    }
    // main program
    public static void main(String[] args){
        int[] test1 = new int[10];
        for(int i = 0; i <10; i++){
            test1[i] = 6*i;
        }
        int[] test2 = new int[10];
        for(int i = 0; i<10; i++){
            test2[i] = 7*i;
        }
        System.out.println(Arrays.toString(divideSeven(test1)));
        System.out.println(Arrays.toString(divideSeven(test2)));
    }
}
