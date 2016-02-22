package com.facility.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Class that represents a maintenance request for a facility
 */
public class MaintenanceRequest {

    private int id;
    private String maintenanceDescription;
    private Timestamp requestedDateTime;
    private BigDecimal maintenanceCost;
    private String status;
    private int facilityId;

    public MaintenanceRequest(int id, String maintenanceDescription, Timestamp requestedDateTime, BigDecimal maintenanceCost, String status, int facilityId) {
        this.id = id;
        this.maintenanceDescription = maintenanceDescription;
        this.requestedDateTime = requestedDateTime;
        this.maintenanceCost = maintenanceCost;
        this.status = status;
        this.facilityId = facilityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaintenanceDescription() {
        return maintenanceDescription;
    }

    public void setMaintenanceDescription(String maintenanceDescription) {
        this.maintenanceDescription = maintenanceDescription;
    }

    public Timestamp getRequestedDateTime() {
        return requestedDateTime;
    }

    public void setRequestedDateTime(Timestamp requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    public BigDecimal getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(BigDecimal maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
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
        return "MaintenanceRequest{" +
                "id=" + id +
                ", maintenanceDescription='" + maintenanceDescription + '\'' +
                ", requestedDateTime=" + requestedDateTime +
                ", maintenanceCost=" + maintenanceCost +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
