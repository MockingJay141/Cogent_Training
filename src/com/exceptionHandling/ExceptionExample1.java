package com.exceptionHandling;

import java.sql.SQLOutput;

/**
 * Exception is an Unwanted/ unexpected event that either occurs in Runtime or Compile Time
 *
 * There are two types of Exceptions 1. Runtime Exception(RTE) 2. Compile time Exception(CTE)
 *
 * If an exception occurs in the code we have the power to decide if we want to continue to the execution of the code
 * or stop the execution.
 *
 * 1. Checked Exceptions: These are also known as CTE, It is necessary to handle these exceptions for the code to finish
 * compiling.
 *
 * 2. Unchecked Exceptions: These are also known as RTE, It is options to handle these exceptions.
 *
 *
 */
public class ExceptionExample1 {

    static int test() {

        /**
         * This is an example of using finally block with return statement
         * Since Final block is always executed hence the return value from the finally block is returned
         *
         * Compiler will always check if there is a Finally block before returning the result of the code.
         *
         * "Finally" block will execute after the execution of all the try and catch blocks. If there is any return statement
         * in the "finally" block the compiler will ignore the return statements of try/catch and return the value from finally block
         *
         */
        try{
            return 0;
        }
        catch (Exception e){
            return 1;
        }
        finally {
            return 2;
        }
    }

    public static void main(String[] args) {

        /*
        'Try' Block will contain the code that we want to test
         */
        try{

            //Class.forName("");// This is another way of creating instance using Reflection API
            String str = null;
            // this line will throw NULL pointer exception
            System.out.println(str.length());

        }
        /*
        'Catch' Block will catch any exceptions thrown by the 'try' block
        we cannot have a 'catch' block without 'try' block.

        We can have multiple catch blocks for one try block to handle different exceptions.
         */
        catch(Exception e){
            // In this code catch block will capture the NULL pointer exception thrown by the try block and display the message.
            System.err.println(e.getMessage());
        }


        System.out.println(test());


        try{
            String x = "abc";
            int result = Integer.parseInt(x);
            // This will throw a "Number Format exception"
            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
