package com.designPattern.Factory;

public class ContractEmployee implements Employee{
    @Override
    public void work() {
        System.out.println("Contract Employee");
    }
}
