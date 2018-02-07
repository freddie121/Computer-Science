package com.company;
import java.time.*;
public class Main {

    public static int[] fibonacci2(int n){
        int[] fibNumbers = new int[n];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        for(int i =2; i<=n; i++){
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];

        }
        return fibNumbers;
    }
    public static void main(String[] args) {

	    fibonacci2(10);
    }
}
