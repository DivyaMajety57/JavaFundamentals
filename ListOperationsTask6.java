package com.divya.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperationsTask6 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(33, 44, 55, 66, 77, 88);

        List<Integer> arrayList = new ArrayList<>(l1);

        System.out.println("Array List has : " + arrayList);

        /*
        Remove 2nd element from list using index
         */
        //System.out.println(l1.remove(1));

        /*
            An UnsupportedOperationException is thrown when a requested operation cannot be performed because it is not supported for that particular class.
            One of the most common causes for this exception is using the asList() method of the java.util.Arrays class. Since this method returns a fixed-size unmodifiable List,
            the add() or remove() methods are unsupported. Trying to add or remove elements from such a List will throw the UnsupportedOperationException exception.
            Other cases where this exception can occur include:

            Using wrappers between collections and primitive types.
            Trying to remove elements using an Iterator.
            Trying to add, remove or set elements using ListIterator.
         */

        System.out.println("List after removal of 2nd element using Index :  "+arrayList.remove(2));
        System.out.println(arrayList);

        arrayList.remove(Integer.valueOf(33));
        System.out.println("List after removal of 2nd element using value : " + arrayList);

        arrayList.add(3,90);
        System.out.println("List after Adding 90 at index 3 :  " + arrayList);

        System.out.println("Length of List : " + arrayList.size());

        //Convert List to array
        Object[] intArray = arrayList.toArray();

        System.out.println("List to Array Conversion");
        for (Object obj:intArray)
            System.out.println( obj);
    }
}
