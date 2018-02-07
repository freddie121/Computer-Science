package com.company;

public class Main {
    public static void addOne(int n) {
        if(n < 4){
            System.out.println(n);
            addOne(n + 1 );
        }
        else{
            System.out.println(n);
        }
    }
    //Declaring the subroutine
    public static int sumEven(int n){
        if(n > 0){
            if(n % 2 == 0){
                n = n + sumEven(n-2);
                return n;
            }
            else {
                /*
                This allows the code to run with an odd number as
                it will return the value of whatever the odd number
                is but start with the even number before it.
                */
                return sumEven(n - 1);
            }
        }
        else
        {
            return(n);
        }
    }

    public static void main(String[] args) {
        //addOne(1);
        System.out.println(sumEven(13));
    }
}
