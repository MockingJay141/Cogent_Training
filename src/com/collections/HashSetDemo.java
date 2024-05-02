package com.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Set Interface
 * There are 3 major type of sets
 * 1. HashSet 2. LinkedHashSet 3. SortedSet-- NavigableSet -- TreeSet(Used for sorting)
 *
 * Properties of HashSet:
 * 1. HashSet doesn't allow duplicates
 * 2. HashSet doesn't preserve order
 * 3. HashSet allows null insertion
 * 4. Hashset is not Thread safe.
 *
 * Internal Data structure of Set is HashMap
 * Since HashMap always stores data in (Key, Value) pair therefore
 * Any data stored in a Set is transferred to Key and Value is randomly generated.
 *
 * Load Factor == 0.75, it used to manage the size of the bucket used to store values of HashMap
 *
 * This class also contains information about the Wrapper Class as well.
 */
public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("def");
        hashSet.add("pqr");
        // HashSet allows null
        hashSet.add(null);

        // HashSet is printed in random order
        System.out.println(hashSet);

        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(new Employee(101, "Allen", 4009, "NY"));
        employeeSet.add(new Employee(101, "Allen", 4009, "NY"));

        /*
        When we add objects into the set JVM calls the HashCode() method of the object class
        To correct this we override the HashCode() method from Object class into our object class.
        HashCode() returns an int value called Hash Value.
        Hash values will be same if the contents of the Objects are same.
        if the Hash values are same then JVM calls the equals() method of the Object class.
        But equals() method of the object class always returns 'false' hence Set treats the objects as different even if
        the hash values are same.

        To correct this we override the equals() method from the object class into our object class

        So when we are adding custom objects into a Set we need to make sure that the Object class has Overridden Both
        hashCode() and equals() methods from the Object Class.

        If we don't do this then set will treat the objects with same values are different and allow duplicates.
         */

        System.out.println(employeeSet);



    }
}

// Wrapper Classes
/*
For each of the primitive data types: byte, short, int, long, float, double, boolean, char
Java has something called wrapper classes like:
1. Byte 2. Short 3. Integer 4. Long 5. Float 6. Double 7. Boolean 8. Char
These classes contain methods of all primitive data types.
All Wrapper classes are child classes of Number Class.
Number class is a child of Object class.


Auto Boxing and Auto UnBoxing:

Auto Unboxing: Assigning wrapper class value into a Data type variable
int a = 10;
Integer a1 = 100;
a = a1; is an example of Auto Unboxing

Auto Boxing: Assigning Data type value to Wrapper class variable
a1 = a; is an example of Auto Boxing
 */