package com.collections;

import java.util.*;

/**
 * This is class that shows demo of the LinkedList data structure of the collection framework.
 *
 * Linked list is made up of individual blocks which contain memory address that points to the next block.
 * When we add a new element to the linked list a new pointer from the block already present in the list to the newly
 * added block is created.
 *
 * Since memory allocation is dynamic in linked list it is preferred to use a linked list when we have a lot of
 * operation involving multiple additions and deletions of elements.
 *
 * Following class shows some prominent method of LinkedList Framework.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        // New LinkedList is created.
        List linkedList = new LinkedList<>();

        List<String> linkedList1 = new LinkedList<>();
        //LinkedList is populated.
        linkedList.add("100");
        linkedList.add("100.5");
        linkedList.add("Hello");
        linkedList.add("null");

        System.out.println(linkedList);
        // Collections.sort will only work we all the elements in the list are of same type
        //In this case since all the elements are String hence values will be sorted based on the ASCII values
        Collections.sort(linkedList);
        System.out.println(linkedList);

        System.out.println("==========================================");


        // Here we are creating a LinkedList to Store objects of the Employee class
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(101, "james", 7805, "NY"));
        employeeList.add(new Employee(102, "Alex", 467  , "TX"));
        // Here we have defined a custom comparator in IdComparator() class, and we are using it to sort the elements of
        //the list.
        Collections.sort(employeeList, new IdComparator());
        System.out.println(employeeList);
        System.out.println("===========================================");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.remove(1));
        System.out.println(linkedList.contains(100));
        System.out.println(linkedList.indexOf("Hello"));

        Collections.synchronizedList(linkedList);
        System.out.println("==========================================");

        // Using an Iterator to iterate through the list.
        // Iterator is present in Collection interface and can be used by all the child interfaces of Collection
        Iterator itr = linkedList.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(linkedList);

        System.out.println("==========================================");

        // ListIterator is only present in List Interface and can only be used by List Interface
        ListIterator listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.nextIndex());
        System.out.println(listIterator.previousIndex());
        System.out.println(listIterator.previous());

    }
}
