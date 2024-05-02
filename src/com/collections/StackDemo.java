package com.collections;

import java.util.Stack;

/**
 * This is a class to show a Demo of Stack data Structure.
 * Stack is the child class of the Vector class
 *
 * Properties of Stack:
 * 1. Stack is a Legacy class
 * 2. Stack works on LIFO principle (Last In First Out)
 * 3. There are two major types of Stacks:
 *      a. Fixed Size
 *      b. Dynamic size
 *
 */
public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("abc");
        stack.push("def");
        stack.push("ghi");
        stack.push("jkl");

        System.out.println(stack);

        System.out.println(stack.search("def"));
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
