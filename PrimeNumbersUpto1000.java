package com.divya.assignment1;

public class PrimeNumbersUpto1000 {

    public static void main(String[] args) {

        int count=0, primeNum=0;

        System.out.println("Prime numbers: ");
        for(int i=2; i<=1000; i++){
           count = 0;
            for(int j=1;j<=1000;j++) {
                    if (i % j == 0)
                        count++;
                    if(count<=2)
                        primeNum = i;
                    else
                        break;
            }
            if(count==2)
                System.out.print(primeNum+" ");
        }
    }
}
