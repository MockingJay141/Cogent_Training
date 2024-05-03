package com.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This is a class to show the Demo of ConcurrentHashMap
 *
 * The major difference between HashMap and ConcurrentHashMap is that
 * HashMap doesn't allow updating elements while iterating whereas ConcurrentHashMap does.
 *
 * ConcurrentHashMap doesn't allow null keys or null values as entries.
 *
 */

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("abc", "Hello");
        concurrentMap.put("xyz", "welcome");
        concurrentMap.put("pqr", "How are you");

        Iterator<String> iterator = concurrentMap.keySet().iterator();

        /*
        HashMap is Fail Fast because it does not allow you to remove element while iterating through the HashMap
        it is not possible to Iterate and update the elements of the HashMap at the same time.
        It will throw "ConcurrentModificationException".

        To do this we need to use ConcurrentHashMap which is Fail Safe
         */
        while (iterator.hasNext()){
            String key = iterator.next();
            if (key.equals("abc")){
                concurrentMap.remove(key);
            }

        }

        System.out.println(concurrentMap);
    }
}
