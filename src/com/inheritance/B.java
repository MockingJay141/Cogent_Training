package com.inheritance;

public class B{

    /*
    This is a static block
     */
    static {
        System.out.println("SIB Block");
    }
    B(){
        // "super" keyword is used to call parent class constructor;
        //super("Hello");

        // IIB block is called here
        System.out.println("B Constructor");
    }
    /*
    This is a IIB Block.
    IIB Block is executed for every object.
    if there are multiple objects then IIB block will run multiple times
     */
    {
        System.out.println("IIB Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        B b1 = new B();
    }
}
// IIB -- instance initialization block
// SIB -- static initialization block: This block is called before main method


// order of calling is
// static Block -> main method -> IIB Block -> Constructor body

