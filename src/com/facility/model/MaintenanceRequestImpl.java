package com.facility.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Class that represents a maintenance request for a facility
 */
public class MaintenanceRequestImpl implements MaintenanceRequest {

    private int id;
    private String maintenanceDescription;
    private Timestamp requestedDateTime;
    private BigDecimal maintenanceCost;
    private String status;
    private int facilityId;

    public MaintenanceRequestImpl(int id, String maintenanceDescription, Timestamp requestedDateTime, BigDecimal maintenanceCost, String status, int facilityId) {
        this.id = id;
        this.maintenanceDescription = maintenanceDescription;
        this.requestedDateTime = requestedDateTime;
        this.maintenanceCost = maintenanceCost;
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
    public String getMaintenanceDescription() {
        return maintenanceDescription;
    }

    @Override
    public void setMaintenanceDescription(String maintenanceDescription) {
        this.maintenanceDescription = maintenanceDescription;
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
    public BigDecimal getMaintenanceCost() {
        return maintenanceCost;
    }

    @Override
    public void setMaintenanceCost(BigDecimal maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
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
        return "MaintenanceRequestImpl{" +
                "id=" + id +
                ", maintenanceDescription='" + maintenanceDescription + '\'' +
                ", requestedDateTime=" + requestedDateTime +
                ", maintenanceCost=" + maintenanceCost +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
