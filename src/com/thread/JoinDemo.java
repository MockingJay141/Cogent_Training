package com.thread;

/**
 * This class shows a demo of the join() method.
 *
 * join() method is used to make sure the Thread running has completed execution and waits for the Thread to
 * die and after that main thread continues its execution.
 */
class MyThread11 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
//            try{
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e){
//                System.out.println(e);
//            }
        }
    }
}

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {

        MyThread11 thread11 = new MyThread11();
        MyThread11 thread12 = new MyThread11();

        thread11.start();
        thread12.start();
        //thread11.join();
        thread12.join();

        for (int i = 0; i < 10; i++){
            System.out.println("Main Thread");
        }

    }
}
