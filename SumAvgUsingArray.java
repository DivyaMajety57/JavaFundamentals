package com.divya.assignment1;

public class SumAvgUsingArray {


    public static void main(String args[]){

        double[] numbers = {10,90.78,111,8989,7876};

        double sumResult = 0;


        //For Loop
        for (int i=0;i<numbers.length;i++) {

            sumResult =  sumResult+numbers[i];

        }

        System.out.println();
        System.out.println("For Loop");
        System.out.println("Sum =  "+sumResult);
        System.out.println("Total numbers count =  "+numbers.length);
        System.out.println("Avg  =  "+sumResult/numbers.length);

        //Advanced For Loop
        sumResult = 0;

        for(double num:numbers)
            sumResult += num;

        System.out.println();
        System.out.println("Advanced For Loop");
        System.out.println("Sum = "+sumResult);
        System.out.println("Avg  =  "+sumResult/numbers.length);

        //While loop
        sumResult = 0;
        int i=0;

        while(i < numbers.length){
            sumResult += numbers[i];
            i++;   // If i don't increment "i" then going to INFINITE LOOP
        }

        System.out.println();
        System.out.println("While Loop");
        System.out.println("Sum = "+sumResult);
        System.out.println("Avg  =  "+sumResult/numbers.length);


    }
}
