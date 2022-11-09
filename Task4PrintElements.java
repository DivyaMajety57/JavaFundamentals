package com.divya.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task4PrintElements {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(45);
        l1.add(90);
        l1.add(45);
        l1.add(23);
        l1.add(90);
        l1.add(44);

        System.out.println("Original List : " + l1);

        // Printing 2nd Element
        System.out.println("Second Element : " + l1.get(1));

        //Printing second last element
        System.out.println("second last element : " + l1.get(l1.size()-2));
    }
}
