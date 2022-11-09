package com.divya.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5ListINList {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(11,22,33);

        List<Integer> l2 = Arrays.asList(9,19,29);

        List<Integer> l3 = Arrays.asList(7,17,27);

        List<List<Integer>> l4 = new ArrayList<>();

        l4.add(l1);
        l4.add(l2);
        l4.add(l3);

        System.out.println(l4);

    }
}
