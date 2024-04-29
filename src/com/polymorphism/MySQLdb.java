package com.polymorphism;

/**
 * This is the class that implements the interface DBLogic
 * all the abstract methods declared in DBLogic have to implemented in this class.
 **/
public class MySQLdb implements DBLogic{

    /*
    All the overridden methods are implemented from DBLogic interface
     */

    @Override
    public void save() {

        System.out.println("MySQL Save");

    }

    @Override
    public void add() {

        System.out.println("MySQL add");

    }

    @Override
    public void update() {

        System.out.println("MySQL update");

    }
}
