package com.thread;

/**
 * Threads:
 * Thread is a lightweight process, we can divide a process in multiple threads.
 * Multi-Threading is used to increase the performance of the application.
 * Every Thread runs parallel to each other and have independent path of execution.
 * Every thread will manage separate stack for execution.
 *
 * There are two main methods to create multiple threads in Java
 * 1. Using the Thread Class.
 * 2. Using the Runnable interface.
 *
 * We initiate multiple threads by using the "start()" method from the Thread.
 * using the object of the class that extends the Thread class with start() method will initialize a new thread
 */

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 10 ; i++){
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getPriority());
    }
}

class MyThread2 implements Runnable{

    public void run(){
        for (int i = 0; i < 10 ; i++){
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getPriority());
    }

}
public class MyThread{

    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        //MyThread1 thread2 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        System.out.println(thread1.getPriority());
        thread1.setPriority(10);
        thread1.start();
        Thread t2 = new Thread(thread2);
        t2.start();
        //thread2.start();
        for (int i = 0; i < 10; i++){
            System.out.println("Main Thread");
        }

    }
}
