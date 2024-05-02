package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap Properties:
 * 1. It stores values in Key, Value pair. Combination of (Key, Value) is called 'Entry'.
 * 2. Key cannot be duplicate, Value can be duplicate.
 * 3. Key and Value both can be null. We can add one null key but multiple null values.
 * 4. It is not order preserved.
 * 5. HashMap is not thread safe.
 *
 */
public class HashMapDemo {

    public static void main(String[] args) {

        Map<Employee, String> hashMap = new HashMap<>();

        hashMap.put(new Employee(101, "Omkar", 4000, "TX"), "1");
        hashMap.put(new Employee(102, "Allen", 5000, "NY"), "2");
        hashMap.put(new Employee(103, "Blake", 6000, "NJ"), "3");
        // HashMap allows null as key
        hashMap.put(null, "1");
        // HashMap allows null as value.
        hashMap.put(new Employee(104, "Blake", 6000, "NJ"), null);

        System.out.println(hashMap);
    }
}
