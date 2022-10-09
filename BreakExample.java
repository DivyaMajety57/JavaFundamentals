package com.divya.assignment1;

/*
    Task 9- Write a program which will break the current execution if it find number 85
	Input – [12,34,66,85,900]

 */

public class BreakExample {

    public static void main(String[] args) {

        int[] data = {12,34,66,85,900};

        for(int i=0; i<data.length; i++) {

            if(data[i]==85)
                break;
            System.out.println(data[i]);
        }

    }
}
