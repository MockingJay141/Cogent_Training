package com.inheritance;


 class W {

    W(int i, int j) {
        System.out.println("I am in subclass");
    }

    public static void main(String[] args) {

        W w2 = new W(10,20);
        System.out.println("Success");

    }
}