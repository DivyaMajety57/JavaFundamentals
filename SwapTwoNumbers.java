package com.divya.assignment1;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10, b=20, temp;

        System.out.println("Before Swap a = "+ a + " , b = " + b );

        //Swap Logic
        temp = a;
        a=b;
        b=temp;

        System.out.println("After Swap a = "+ a + ", b = " + b );



    }
}
