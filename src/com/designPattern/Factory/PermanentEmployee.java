package com.designPattern.Factory;

public class PermanentEmployee implements Employee {
    @Override
    public void work() {
        System.out.println("Permanent Employee");
    }
}
