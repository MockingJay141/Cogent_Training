package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Properties of HashSet:
 *  1. LinkedHashSet doesn't allow duplicates
 *  2. LinkedHashSet preserves order this is different from HashSet
 *  3. LinkedHashSet allows null insertion
 *  4. LinkedHashset is Thread safe. this is also different from HashSet
 *
 *  Two main difference between HashSets and LinkedHashSets is that LinkedHashSets Preserves order and are thread safe.
 *
 *
 *
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("def");
        linkedHashSet.add("pqr");
        linkedHashSet.add(null);

        // LinkedHashSet is printed in the order of insertion hence the order is preserved.
        System.out.println(linkedHashSet);
    }
}
