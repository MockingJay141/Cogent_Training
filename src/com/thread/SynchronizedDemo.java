package com.thread;

/**
 * This is the class that is used to show a Demo of synchronized keyword
 * synchronized is the way to make a method, object or a block of code Thread safe.
 *
 * Synchronized acts a lock and JVM or Thread handler only allows one thread to access anything that is under the
 * synchronized keyword.
 *
 * This can also lead to possible DeadLocks if there are two different threads fighting for same resources locked by each
 * other, then none of the Threads can get the resources they need and hence they are in DeadLock.
 */
public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d = new Display();
        MyThread13 t1 = new MyThread13(d, "Allen");
        MyThread13 t2 = new MyThread13(d, "Blake");

        t1.start();
        t2.start();
    }
}
