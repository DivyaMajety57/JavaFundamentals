package com.divya.assignment1;

import java.lang.*;

 /*
    Task 3-  Write a program to print the average of below 5 numbers.
	10,90.78,111,8989,7876

 */

public class AvgFiveNumbers {

    public static void main(String[] args) {

        byte a = 10;
        double b = 90.78;
        int c = 111;
        int d = 8989;
        int e = 7876;

       // long  longSumResult = a+b+c+d+e;  //Incompatiable type exception
        double doubleSumResult = a+b+c+d+e;
        double doubleAvgResult = a+b+c+d+e/5;


        System.out.println("Sum of a+b+c+d+e = " + doubleSumResult);
        System.out.println("Avg of a+b+c+d+e = " + doubleAvgResult);




    }
}
