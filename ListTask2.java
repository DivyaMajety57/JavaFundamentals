package com.divya.assignment3;

import java.util.ArrayList;
import java.util.List;

public class ListTask2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);


        System.out.println(list1);

        for(Integer l1: list1) {
            System.out.println(l1);
        }


    }

}
