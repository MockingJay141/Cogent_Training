package com.model;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private Integer id;
    private String street;
    private String state;
    private String country;
    private long zipcode;

    public Address() {
    }

    public Address(Integer id, String street, String state, String country, long zipcode) {
        this.id = id;
        this.street = street;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
