package com.collections;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * This is a class to show the Demo of WeakHashMap and how garbage collector works
 *
 * here we are setting the object 'e' to null and then calling System.gc() to remove the object set to null
 *
 * This will not work with HashMap as it will not allow the object associated with it to be set to null. Hence it only works
 * with WeakHashMap.
 */
public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {
        Map<Employee, String> weakMap = new WeakHashMap<>();

        Employee e = new Employee(101, "Omkar", 4000, "NY");
        weakMap.put(e, "Hello");
        e = null;

        System.out.println(weakMap);
        // Here the garbage collector will call the finalize() method from Employee class
        System.gc();
        Thread.sleep(5000);
        System.out.println(weakMap);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called");
    }
}
