package com.divya.assignment1;

public class StarPattern {


    public static void main(String[] args) {

        for(int i=0; i<6; i++) {
            System.out.println();
            for(int j=0; j<6; j++) {
                if(j<=i)
                    System.out.print(" * ");
            }
        }

    }
}
