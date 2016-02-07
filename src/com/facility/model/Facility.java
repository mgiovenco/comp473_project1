package com.facility.model;

import java.util.List;

/**
 * Class represents the building units (buildings which contain rooms)
 * that a company uses to support the activities of the business.
 */
public class Facility {

    private int id;
    private int name;
    private List<Building> buildings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }
}