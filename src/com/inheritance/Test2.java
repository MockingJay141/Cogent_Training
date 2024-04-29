package com.inheritance;

public class Test2 {
    public static void main(String[] args) {
        /*
        Calling order will be "B" class constructor -> "A" class String constructor -> "A" class default constructor ->
        "A" class int constructor

        Execution order will be reverse of calling order.
         */
        B b = new B();
    }
}
