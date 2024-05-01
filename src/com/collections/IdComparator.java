package com.collections;

import java.util.Comparator;

/**
 * This class shows us how to implement our own comparator by implementing the comparator interface
 *
 * compare(o1, o2) method of the Comparator interface return -1, 0, 1 based on the comparisons of the objects provided.
 *
 * -1 if o1 > o2
 * 0 if o1 == o2
 * 1 if o1 < o2
 */

public class IdComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2){
        return o1.getId().compareTo(o2.getId());
    }
}
