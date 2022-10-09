package com.divya.assignment1;

/*
    Task 10- Write a program which will break the current execution if it find “Selenium”
	Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

 */

public class StringBreakExample {

    public static void main(String[] args) {

        String[] data = {"Java","JavaScript","Selenium","Python","Mukesh"};

        for(int i=0; i<data.length; i++){
            if(data[i].equals("Selenium"))
                break;
         System.out.println(data[i]+" ");
        }
    }

}
