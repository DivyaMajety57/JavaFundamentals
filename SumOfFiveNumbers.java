package com.divya.assignment1;


/*
Task -2
Write a program to print the sum of below 5 numbers.
	10,90.78,111,8989,7876

 */
public class SumOfFiveNumbers {

    byte a = 10;
    double b = 90.78;
    int c = 111;
    int d = 8989;
    int e = 7876;

    double result=a+b+c+d+e;


    public static void main(String[] args) {

        SumOfFiveNumbers sumFive = new SumOfFiveNumbers();

        System.out.println();
        System.out.println("sum of "+sumFive.a+"+"+sumFive.b+"+"+sumFive.c+"+"+sumFive.d+"+"+sumFive.e+"="+sumFive.result);

    }


}
