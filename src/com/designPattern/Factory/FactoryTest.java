package com.designPattern.Factory;

public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Employee e = factory.getEmployee("Software");
        Employee e1 = factory.getEmployee("Permanent");
        Employee e2 = factory.getEmployee("Contract");

        e.work();
        e1.work();
        e2.work();
    }
}
