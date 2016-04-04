package com.facility.model;

/**
 * Class for representing additional facility details that are outside
 */
public class FacilityDetailImpl implements FacilityDetail {

    private int id;
    private String detail;

    public FacilityDetailImpl() {
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "FacilityDetailImpl{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                '}';
    }
}
