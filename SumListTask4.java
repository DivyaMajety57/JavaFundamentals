package com.divya.assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumListTask4 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(1000);
        list1.add(2000);
        list1.add(3000);
        list1.add(4000);


        System.out.println(list1);

        Iterator<Integer> i1 = list1.iterator();

        int temp=0,sum=0;
        while(i1.hasNext()) {
            sum=temp+i1.next();
            temp=sum;
        }
        System.out.println("Sum of list: "+ sum);

    }

}
