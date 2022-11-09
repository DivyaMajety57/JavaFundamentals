package com.divya.assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1ListReverse {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("Selenium");
        l1.add("TestNG");
        l1.add("Git");
        l1.add("Github");

        System.out.println("List : ");
         Iterator<String> itr = l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

        System.out.println();
        System.out.println("Reverse List : ");
        for(int i=1; i<=l1.size(); i++){
            System.out.println(l1.get(l1.size()-i));
        }

    }
}
