package com.facility.model;

import java.util.Date;

/**
 * Class that represents a inspection done a particular facility
 */
public class Inspection {

    private int id;
    private String type;
    private Date requestedDate;
    private Date inspectionDate;
    private String status;
    private int facilityId;

    public Inspection(int id, String type, Date requestedDate, Date inspectionDate, String status) {
        this.id = id;
        this.type = type;
        this.requestedDate = requestedDate;
        this.inspectionDate = inspectionDate;
        this.status = status;
    }

    public Inspection(int id, String type, Date requestedDate, Date inspectionDate, String status, int facilityId) {
        this.id = id;
        this.type = type;
        this.requestedDate = requestedDate;
        this.inspectionDate = inspectionDate;
        this.status = status;
        this.facilityId = facilityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
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
        return "Inspection{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", requestedDate=" + requestedDate +
                ", inspectionDate=" + inspectionDate +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
