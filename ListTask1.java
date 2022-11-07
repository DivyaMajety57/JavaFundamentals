package com.divya.assignment3;

import java.util.*;

public class ListTask1 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        System.out.println(list1);

        for(int i=0; i<list1.size(); i++) {
            System.out.println(list1.get(i));
        }


    }

}
