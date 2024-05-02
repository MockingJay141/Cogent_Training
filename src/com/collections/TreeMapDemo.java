package com.collections;

import java.util.*;

/**
 * Properties of TreeMap:
 * 1. It stores Entry in Key Value pair.
 * 2. It does not allow null keys but allows null values.
 * 3. Keys should be of the same type.
 * 4. Key should be comparator or comparable type.
 * 5. It is always sorted on the key values
 *
 * If we have custom objects as keys then the object class should have overridden the HashCode() and equal() method,
 * and we need to provide custom comparator to the tree.
 */
public class TreeMapDemo {

    public static void main(String[] args) {

        // If we don't provide custom comparator it will throw ClassCastException.
        Map<Employee, String> treeMap = new TreeMap<>(new NameComparator());

        treeMap.put(new Employee(101, "Omkar", 4000, "TX"), "1");
        treeMap.put(new Employee(102, "Allen", 5000, "NY"), "2");
        treeMap.put(new Employee(103, "Blake", 6000, "NJ"), "3");
        //treeMap.put(null, "1");
        //treeMap.put(new Employee(104, "Blake", 6000, "NJ"), null);

        //System.out.println(treeMap);

        Set set = treeMap.keySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Employee key = (Employee) iterator.next();
            String value = treeMap.get(key);
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }
    }
}
