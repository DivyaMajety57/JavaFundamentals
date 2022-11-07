package com.divya.assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTask7 {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("Web Automation");
        l1.add("API Automation");
        l1.add("Mobile Automation");

        Iterator<String> itr = l1.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str.contains("Mobile"));
        }

    }
}
