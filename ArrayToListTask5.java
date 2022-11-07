package com.divya.assignment3;

import java.util.Arrays;
import java.util.List;

public class ArrayToListTask5 {

    public static void main(String[] args) {

        Integer[] values = {1,2,3,4,5};

        /*List<Integer> l1 = new ArrayList<>();*/

        List<Integer> l1  = Arrays.asList(values);

        System.out.println(l1);
    }
}

