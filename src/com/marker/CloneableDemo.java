package com.marker;


class myClass implements Cloneable{

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

/**
 * Clone is another way of creating Object.
 * Three ways of creating objects are
 * 1. new Keyword
 * 2. Class.forName
 * 3. clone() method
 */
public class CloneableDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        myClass m1 = new myClass();

        myClass m2 = (myClass) m1.clone();

    }
}
