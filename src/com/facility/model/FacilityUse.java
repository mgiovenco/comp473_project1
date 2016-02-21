package com.facility.model;

import java.sql.Timestamp;

/**
 * Class for representing facility use (who and when is scheduled to use the facility)
 */
public class FacilityUse {

    private int id;
    private Timestamp startDatetime;
    private Timestamp endDatetime;
    private int custId;
    private String status;
    private int facilityId;

    public FacilityUse(int id, Timestamp startDatetime, Timestamp endDatetime, int custId, String status, int facilityId) {
        this.id = id;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.custId = custId;
        this.status = status;
        this.facilityId = facilityId;
    }

    public FacilityUse(Timestamp startDatetime, Timestamp endDatetime, int custId, String status, int facilityId) {
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.custId = custId;
        this.status = status;
        this.facilityId = facilityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Timestamp startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Timestamp getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Timestamp endDatetime) {
        this.endDatetime = endDatetime;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public String toString() {
        return "FacilityUse{" +
                "id=" + id +
                ", startDatetime=" + startDatetime +
                ", endDatetime=" + endDatetime +
                ", custId=" + custId +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
