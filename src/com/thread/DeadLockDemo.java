package com.thread;

/**
 * This is the class to show the demo of a scenario of DeadLock.
 * Dead lock is a situation that occurs when two threads need the same resource for completion, and it is locked
 * behind synchronized block.
 *
 * In this class both the threads of block-1 and block-2 need both resources (a) and (b) for completion and both
 * are locked behind synchronized blocks hence neither of the thread can complete execution leading to a DeadLock situation.
 *
 * To Resolve the DeadLock in this situation we just have to switch the order of resources 'a' and 'b' in one of the
 * synchronized blocks.
 * By switching the blocks we ensure that both the resources are not locked by different threads at the same time.
 *
 */
public class DeadLockDemo {

    public static void main(String[] args) {
        DeadLockDemo test = new DeadLockDemo();

        final A a = test.new A();
        final B b = test.new B();

        Runnable block1 = new Runnable() {
            @Override
            public void run() {
                synchronized (a) {
                    try{
                        System.out.println("Block-1 Starts");

                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (b) {
                        System.out.println("Block 1 ends");
                    }
                }
            }
        };

        Runnable block2 = new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    try{
                        System.out.println("Block-2 Starts");

                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (a){
                        System.out.println("Block 2 ends");
                    }
                }

            }
        };

        new Thread(block1).start();
        new Thread(block2).start();
    }

    private class B{
        private int i = 20;
        public int getI(){
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    private class A{
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
