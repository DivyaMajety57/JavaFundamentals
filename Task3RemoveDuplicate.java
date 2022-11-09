package com.divya.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task3RemoveDuplicate {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("TestNG");
        l1.add("Maven");
        l1.add("Java");

        System.out.println("Original List: " + l1);

        for(int i=0; i<l1.size(); i++) {
            for(int j=i+1; j<l1.size(); j++) {
                if(l1.get(i).equalsIgnoreCase(l1.get(j))){
                    //System.out.println(l1.get(i));
                    l1.remove(j);
                }

            }
        }

        System.out.println("List after Duplicates removed: " + l1);

    }
}
