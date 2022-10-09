package com.divya.assignment1;


/*
    Task 4- Write a program to print all even numbers from 1-200
 */

public class EvenNumber {

    public static void main(String[] args) {

        System.out.println("For Loop");
        System.out.println("Even numbers for 1 to 200: " );

        for(int i=1; i<=200; i++){
            if(i%2 == 0)
               System.out.println(i+" ");
        }


        int i=1;
        System.out.println("While Loop");
        System.out.println("Even numbers for 1 to 200: " );
        while(i<=200){
            if(i%2 == 0)
                System.out.println(i);
         i++;
        }

    }
}
