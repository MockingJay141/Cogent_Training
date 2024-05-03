package com.thread;

/**
 * This is the class to show a Demo of how wait() and notify() methods of the Thread class work.
 *
 * When Thread.wait() is called the thread calling is put on indefinite wait till it receives a "notify()" from
 * another thread in the program.
 * If there is no "notify()" call then the waiting thread will never complete it's execution and will keep on running till
 * Daemon thread kills it and code ends with code1 i.e. unsuccessful completion.
 *
 */
public class WaitAndNotifyDemo extends Thread {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized(b)
        {
            System.out.println("Main Method calling wait method ");
            b.wait();
            System.out.println("Main Got Notification");
            System.out.println(b.total);
        }
    }
}

class ThreadB extends Thread
{
    int total = 0;
    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child Starting calculation");
            for(int i = 1; i<=100; i++)
            {
                total = total + i;
            }
            System.out.println("Child giving notification");
            this.notify();
        }
    }
}
