package com.facility.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Class that represents a inspection done a particular facility
 */
public class Inspection {

    private int id;
    private String type;
    private Timestamp requestedDateTime;
    private Timestamp inspectionDateTime;
    private String status;
    private int facilityId;

    public Inspection(int id, String type, Timestamp requestedDateTime, Timestamp inspectionDateTime, String status) {
        this.id = id;
        this.type = type;
        this.requestedDateTime = requestedDateTime;
        this.inspectionDateTime = inspectionDateTime;
        this.status = status;
    }

    public Inspection(int id, String type, Timestamp requestedDateTime, Timestamp inspectionDateTime, String status, int facilityId) {
        this.id = id;
        this.type = type;
        this.requestedDateTime = requestedDateTime;
        this.inspectionDateTime = inspectionDateTime;
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

    public Timestamp getRequestedDateTime() {
        return requestedDateTime;
    }

    public void setRequestedDateTime(Timestamp requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    public Timestamp getInspectionDateTime() {
        return inspectionDateTime;
    }

    public void setInspectionDateTime(Timestamp inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
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
                ", requestedDateTime=" + requestedDateTime +
                ", inspectionDateTime=" + inspectionDateTime +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
