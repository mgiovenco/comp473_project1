package com.facility.model;

import java.sql.Timestamp;

/**
 * Class for representing facility use (who and when is scheduled to use the facility)
 */
public class FacilityUseImpl implements FacilityUse {

    private int id;
    private Timestamp startDatetime;
    private Timestamp endDatetime;
    private int custId;
    private String status;
    private int facilityId;

    public FacilityUseImpl(int id, Timestamp startDatetime, Timestamp endDatetime, int custId, String status, int facilityId) {
        this.id = id;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.custId = custId;
        this.status = status;
        this.facilityId = facilityId;
    }

    public FacilityUseImpl(Timestamp startDatetime, Timestamp endDatetime, int custId, String status, int facilityId) {
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.custId = custId;
        this.status = status;
        this.facilityId = facilityId;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Timestamp getStartDatetime() {
        return startDatetime;
    }

    @Override
    public void setStartDatetime(Timestamp startDatetime) {
        this.startDatetime = startDatetime;
    }

    @Override
    public Timestamp getEndDatetime() {
        return endDatetime;
    }

    @Override
    public void setEndDatetime(Timestamp endDatetime) {
        this.endDatetime = endDatetime;
    }

    @Override
    public int getCustId() {
        return custId;
    }

    @Override
    public void setCustId(int custId) {
        this.custId = custId;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int getFacilityId() {
        return facilityId;
    }

    @Override
    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public String toString() {
        return "FacilityUseImpl{" +
                "id=" + id +
                ", startDatetime=" + startDatetime +
                ", endDatetime=" + endDatetime +
                ", custId=" + custId +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
