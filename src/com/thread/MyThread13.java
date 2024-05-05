package com.thread;

public class MyThread13 extends Thread {

    Display d;
    String name;

    public MyThread13(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
