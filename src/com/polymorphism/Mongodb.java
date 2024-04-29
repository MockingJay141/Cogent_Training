package com.polymorphism;
/**
 * This is the class that implements the interface DBLogic
 * all the abstract methods declared in DBLogic have to implemented in this class.
 **/
public class Mongodb implements DBLogic{

    /*
    All the overridden methods are implemented from DBLogic interface
     */
    @Override
    public void save() {

        System.out.println("Mongo save");

    }

    @Override
    public void add() {

        System.out.println("Mongo Add");

    }

    @Override
    public void update() {

        System.out.println("Mongo update");

    }
}
