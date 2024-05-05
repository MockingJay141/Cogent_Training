package com.innerClass;

/**
 * This is a class to show the demo of Anonymous Inner class using interface.
 *
 * Anonymous class is inner class that has no name and, it is declared implicitly.
 * Object of this class can be only be created only during the time it is declared since it has no name object cannot
 * be created afterwards.
 *
 */
interface MyInterface{
    void test();
}
public class AnonymousInnerClassDemo {

    public static void main(String[] args) {


        /*
        As we know that Interface doesn't have any constructor and hence we cannot create any objects of interfaces
        but here we are using Anonymous inner class to implement the Interface and create the object of that
        anonymous class. Here the object of anonymous class is 'mi' and we are using this object to access the "test()"
        method which is present inside this class.
         */
        MyInterface mi = new MyInterface() {
            @Override
            public void test() {
                System.out.println("Anonymous Inner class");
            }
        };

        mi.test();
    }
}
