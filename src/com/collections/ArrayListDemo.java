package com.collections;

import java.util.*;

/**
 * This is a class to show the demo of the ArrayList Data structure of the collection framework.
 *
 * The major difference between arrays and ArrayList is the
 * Arrays have FIXED SIZE and ArrayLists have DYNAMIC SIZE.
 *
 * Unlike LinkedList, all the nodes of ArrayLists have the same memory address.
 *
 * Key Properties of Array list are:
 * 1. Array List always preserves order
 * 2. Null insertion is allowed in array list
 * 3. We can add heterogeneous elements
 * 4. ArrayList is not synchronized/ not thread safe
 * 5. Duplicate elements are allowed in ArrayList.
 *
 * ArrayList implements RandomAccess Interface hence we can access any element with same speed without having to iterate
 * over the complete list.
 * Hence, ArrayList is best to use when we have frequent retrieval operations.
 * ArrayList is not recommended if we have frequent addition and deletion operations.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        //Creation of new ArrayList
        List<Object> list = new ArrayList<>();

        // ArrayList is populated
        // Since ArrayList can contain heterogeneous element hence we are adding different types of elements
        list.add(123);
        // ArrayList allows duplicate values
        list.add(123);
        // "null" value can be added to ArrayList
        list.add(null);
        list.add("Hello");
        list.add(345.5);

        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.remove(1));

        System.out.println(list);
        System.out.println(list.contains("Hello"));
        System.out.println(list.size());

        /*
        1. Array List always preserves order
        2. Null insertion is allowed in array list
        3. We can add heterogeneous elements
        4. ArrayList is not synchronized/ not thread safe
        5. Duplicate elements are allowed in ArrayList.
         */

        // Make the ArrayList Thread Safe by making it synchronized.
        Collections.synchronizedList(list);
        System.out.println("========================");

        // Using the Iterator class to iterate over the ArrayList
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();
        }

        System.out.println(list);
        System.out.println("======================");

        // Using the ListIterator to iterate over the array list.
        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("======================");
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.nextIndex());
        System.out.println(listIterator.previousIndex());
        System.out.println(listIterator.previous());

    }
}

/*
Difference between Arrays and ArrayLists
1. Arrays have fixed memory while ArrayLists have dynamic memory.
2. Arrays have better performance as compared to ArrayLists.

 */
