package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Properties of Hash Table:
 * 1. HashTable is a legacy class.
 * 2. It does not allow null key or null values.
 * 3. It is Thread safe.
 * 4. It does not preserve order.
 * 5. Key cannot be duplicate, value can be duplicate.
 *
 */
public class HashTableDemo {

    public static void main(String[] args) {
        Map<Employee, String> hashtable = new Hashtable<>();

        hashtable.put(new Employee(101, "Omkar", 4000, "TX"), "1");
        hashtable.put(new Employee(102, "Allen", 5000, "NY"), "2");
        hashtable.put(new Employee(103, "Blake", 6000, "NJ"), "3");
        // We cannot have null values it will throw NullPointerException
        //hashtable.put(null, "1");
        //hashtable.put(new Employee(104, "Blake", 6000, "NJ"), null);

        System.out.println(hashtable);
    }
}
