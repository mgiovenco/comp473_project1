package com.facility.model;

import java.sql.Timestamp;

/**
 * Class that represents a inspection done a particular facility
 */
public class InspectionImpl implements Inspection {

    private int id;
    private String type;
    private Timestamp requestedDateTime;
    private Timestamp inspectionDateTime;
    private String status;
    private int facilityId;

    public InspectionImpl(int id, String type, Timestamp requestedDateTime, Timestamp inspectionDateTime, String status) {
        this.id = id;
        this.type = type;
        this.requestedDateTime = requestedDateTime;
        this.inspectionDateTime = inspectionDateTime;
        this.status = status;
    }

    public InspectionImpl(int id, String type, Timestamp requestedDateTime, Timestamp inspectionDateTime, String status, int facilityId) {
        this.id = id;
        this.type = type;
        this.requestedDateTime = requestedDateTime;
        this.inspectionDateTime = inspectionDateTime;
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
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Timestamp getRequestedDateTime() {
        return requestedDateTime;
    }

    @Override
    public void setRequestedDateTime(Timestamp requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    @Override
    public Timestamp getInspectionDateTime() {
        return inspectionDateTime;
    }

    @Override
    public void setInspectionDateTime(Timestamp inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
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
        return "InspectionImpl{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", requestedDateTime=" + requestedDateTime +
                ", inspectionDateTime=" + inspectionDateTime +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
