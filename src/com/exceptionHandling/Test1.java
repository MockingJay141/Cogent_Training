package com.exceptionHandling;

/**
 * This class is used to solve the questions of the assignment1 (04/29/2024)
 *
 * Topic: Exception Handling
 */
public class Test1 {
}

class Test2    {
    void m()
    {
        int i=50/0;
    }
    void n()
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("exception handled");
        }
    }
    public static void main(String args[])  {
        Test2 obj=new Test2();
        obj.p();
        System.out.println("normal flow...");
    }
}















