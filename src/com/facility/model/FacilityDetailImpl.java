package com.facility.model;

/**
 * Class for representing additional facility details that are outside
 */
public class FacilityDetailImpl implements FacilityDetail {

    private int id;
    private String detail;
    private int facilityId;

    public FacilityDetailImpl(String detail, int facilityId) {
        this.detail = detail;
        this.facilityId = facilityId;
    }

    public FacilityDetailImpl(int id, String detail, int facilityId) {
        this.id = id;
        this.detail = detail;
        this.facilityId = facilityId;
    }

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getDetail() {
        return detail;
    }

    @Override
    public int getFacilityId() {
        return facilityId;
    }

    @Override
    public String toString() {
        return "FacilityDetailImpl{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
