package com.facility.model;

import java.util.List;

/**
 * Class represents the building units (buildings which contain rooms)
 * that a company uses to support the activities of the business.
 */
public class FacilityImpl implements Facility {

    private int id;
    private String name;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private int capacity;

    private List<FacilityDetailImpl> facilityDetailImpls;

    public FacilityImpl(String name, String line1, String line2, String city, String state, String zip, String phone, int capacity) {
        this.name = name;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.capacity = capacity;
    }

    // Constructor with facility details
    public FacilityImpl(int id, String name, String line1, String line2, String city, String state, String zip, String phone, int capacity) {
        this.id = id;
        this.name = name;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.capacity = capacity;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLine1() {
        return line1;
    }

    @Override
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @Override
    public String getLine2() {
        return line2;
    }

    @Override
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getZip() {
        return zip;
    }

    @Override
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<FacilityDetailImpl> getFacilityDetailImpls() {
        return facilityDetailImpls;
    }

    public void setFacilityDetailImpls(List<FacilityDetailImpl> facilityDetailImpls) {
        this.facilityDetailImpls = facilityDetailImpls;
    }

    @Override
    public String toString() {
        return "FacilityImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", facilityDetailImpls=" + facilityDetailImpls +
                '}';
    }
}