package com.reactiveProgramming;

import java.util.List;

/**
 * Converting Flux to List
 */
public class Exercise3 {

    public static void main(String[] args) {

        //Convert Flux to list
        List<Integer> result = ReactiveSources.intNumbersFlux().log().toStream().toList();

        System.out.println("List is: " + result);
        System.out.println("Size is: " + result.size());
    }
}
