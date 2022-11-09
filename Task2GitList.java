package com.divya.assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Task2GitList {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("Git");
        l1.add("Github");
        l1.add("GitLab");
        l1.add("GitBash");
        l1.add("Selenium");
        l1.add("Java");
        l1.add("Maven");

        List<String> gitList = new ArrayList<>();
        Iterator<String> itr = l1.iterator();

        while(itr.hasNext()){

            String str = itr.next();

            if(str.contains("Git")) {
                gitList.add(str);
            }

        }

        System.out.println("Original List : " + l1);
        System.out.println("List that contains Git : " + gitList);
    }
}
