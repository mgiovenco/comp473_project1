package com.facility.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Class that represents maintenance for a facility.
 * Note: maintenance does not always need approval (such as vacuuming, dusting, etc) which is why maintenance and maintenance request are decoupled.
 */
public class MaintenanceImpl implements Maintenance {

    private int id;
    private String maintenanceDescription;
    private Timestamp lastOccurenceDateTime;
    private BigDecimal maintenanceCost;
    private String status;
    private String recommendedOccurenceRate;

    public MaintenanceImpl() {
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
    public Timestamp getLastOccurenceDateTime() {
        return lastOccurenceDateTime;
    }

    @Override
    public void setLastOccurenceDateTime(Timestamp lastOccurenceDateTime) {
        this.lastOccurenceDateTime = lastOccurenceDateTime;
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
    public String getRecommendedOccurenceRate() {
        return recommendedOccurenceRate;
    }

    @Override
    public void setRecommendedOccurenceRate(String recommendedOccurenceRate) {
        this.recommendedOccurenceRate = recommendedOccurenceRate;
    }

    @Override
    public String toString() {
        return "MaintenanceImpl{" +
                "id=" + id +
                ", maintenanceDescription='" + maintenanceDescription + '\'' +
                ", lastOccurenceDateTime=" + lastOccurenceDateTime +
                ", maintenanceCost=" + maintenanceCost +
                ", status='" + status + '\'' +
                ", recommendedOccurenceRate='" + recommendedOccurenceRate + '\'' +
                '}';
    }
}
