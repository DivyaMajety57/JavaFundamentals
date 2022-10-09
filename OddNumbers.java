package com.divya.assignment1;

/*

    Task 5- Write a program to print all odd numbers from 1-50
 */


public class OddNumbers {

    public static void main(String[] args){

        //For Loop
        System.out.println();
        System.out.println("For Loop");
        System.out.println("Odd Number from 1 to 50");
        for(int i=1; i<=50; i+=2)
            System.out.println(i);

        //while Loop
        System.out.println();
        System.out.println("While Loop");
        System.out.println("Odd Number from 1 to 50");

        int i=1;
        System.out.println(i);
        while(i<=50)
            System.out.println(i+=2);


    }
}
