package com.facility.model;

import java.util.List;

/**
 * Class represents the building units (buildings which contain rooms)
 * that a company uses to support the activities of the business.
 */
public class Facility {

    private int id;
    private String name;
    //private List<Building> buildings;

    public Facility(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}