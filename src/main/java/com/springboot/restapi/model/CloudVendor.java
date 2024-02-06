package com.springboot.restapi.model;

import lombok.*;

public class CloudVendor {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;

    public CloudVendor() {
        this.id = "0";
        this.name = "Ruslan";
        this.address = "New York City";
        this.phoneNumber = "6666666666";
    }

    public CloudVendor(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
