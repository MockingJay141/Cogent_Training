package com.polymorphism;

/**
 * This is the class to show a situation where we have to override the method with 'Default' access modifier.
 *
 * Interface also has a way to specify the super call for a particular method.
 * "ClassName.super().MethodName;"
 * This is only available for Interfaces and not other classes.
 *
 */
public class MultipleInheritanceDemo implements MultipleInheritanceA,MultipleInheritanceB{
    @Override
    public void calculate() {

    }

    @Override
    public void test() {
        /*
        Normally with super call we aren't allowed call super using className.super.
        But in case of Multiple Inherited Interface which have the same Default method we can override the default method
        in the child class and use ClassName.super to call the default method from a particular interface. As we can see
        in the example given below.
         */
        MultipleInheritanceA.super.test();
        MultipleInheritanceB.super.test();
        System.out.println("Main Class Test()");
    }

    public static void main(String[] args) {
        MultipleInheritanceDemo demo = new MultipleInheritanceDemo();
        demo.test();
    }
}
