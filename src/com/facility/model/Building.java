package com.facility.model;

import java.util.List;

/**
 * Class represents a building that belongs to a specific FacilityDao.
 */
public class Building {

    private int id;
    private String name;
    private List<Room> rooms;

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

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
