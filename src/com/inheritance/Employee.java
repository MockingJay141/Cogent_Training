package com.inheritance;

public class Employee {

    private int id;
    private String name;
    private String address;
    private String mobileNo;

    public Employee() {
    }

    public Employee(int id, String name, String address, String mobileNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
