package com.facility.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Class that represents maintenance for a facility.
 * Note: maintenance does not always need approval (such as vacuuming, dusting, etc) which is why maintenance and maintenance request are decoupled.
 */
public class Maintenance {

    private int id;
    private String maintenanceDescription;
    private Timestamp lastOccurenceDateTime;
    private BigDecimal maintenanceCost;
    private String status;
    private String recommendedOccurenceRate;
    private int facilityId;

    public Maintenance(int id, String maintenanceDescription, Timestamp lastOccurenceDateTime, BigDecimal maintenanceCost, String status, String recommendedOccurenceRate, int facilityId) {
        this.id = id;
        this.maintenanceDescription = maintenanceDescription;
        this.lastOccurenceDateTime = lastOccurenceDateTime;
        this.maintenanceCost = maintenanceCost;
        this.status = status;
        this.recommendedOccurenceRate = recommendedOccurenceRate;
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

    public Timestamp getLastOccurenceDateTime() {
        return lastOccurenceDateTime;
    }

    public void setLastOccurenceDateTime(Timestamp lastOccurenceDateTime) {
        this.lastOccurenceDateTime = lastOccurenceDateTime;
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

    public String getRecommendedOccurenceRate() {
        return recommendedOccurenceRate;
    }

    public void setRecommendedOccurenceRate(String recommendedOccurenceRate) {
        this.recommendedOccurenceRate = recommendedOccurenceRate;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "id=" + id +
                ", maintenanceDescription='" + maintenanceDescription + '\'' +
                ", lastOccurenceDateTime=" + lastOccurenceDateTime +
                ", maintenanceCost=" + maintenanceCost +
                ", status='" + status + '\'' +
                ", recommendedOccurenceRate='" + recommendedOccurenceRate + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
