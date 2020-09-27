package com.lab6;

public class PersonalDetails {

    private String name;
    private String address;

    public PersonalDetails(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | Address: " + this.address;
    }

}
