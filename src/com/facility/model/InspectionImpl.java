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

    public InspectionImpl() {
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
    public String toString() {
        return "InspectionImpl{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", requestedDateTime=" + requestedDateTime +
                ", inspectionDateTime=" + inspectionDateTime +
                ", status='" + status + '\'' +
                '}';
    }
}
