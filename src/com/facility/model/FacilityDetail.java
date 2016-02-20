package com.facility.model;

import java.util.Date;

/**
 * Class for representing additional facility details that are outside
 */
public class FacilityDetail {

    private int id;
    private String detail;
    private int facilityId;

    public FacilityDetail(String detail, int facilityId) {
        this.detail = detail;
        this.facilityId = facilityId;
    }

    public FacilityDetail(int id, String detail, int facilityId) {
        this.id = id;
        this.detail = detail;
        this.facilityId = facilityId;
    }

    public int getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }

    public int getFacilityId() {
        return facilityId;
    }

    @Override
    public String toString() {
        return "FacilityDetail{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
