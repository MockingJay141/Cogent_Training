package com.polymorphism;

public interface DBLogic {

    public void save();
    public void add();

    public void update();

}


/*
What is interface?
It is a way of implementing abstraction, interface will always have abstract method by default

abstract method -- it is type of method which will not have anybody/implementation, they only have declaration.

Interface cannot be instantiated hence they cannot have constructor.

Till Java 1.7 we cannot write implementation of interface but from Java 8 onwards we can write implementation of methods.
These special methods are called Default methods.
Default methods are useful when the same method is used by all the classes implementing the interface.
 */