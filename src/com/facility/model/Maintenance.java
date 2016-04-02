package com.facility.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public interface Maintenance {

    int getId();

    void setId(int id);

    String getMaintenanceDescription();

    void setMaintenanceDescription(String maintenanceDescription);

    Timestamp getLastOccurenceDateTime();

    void setLastOccurenceDateTime(Timestamp lastOccurenceDateTime);

    BigDecimal getMaintenanceCost();

    void setMaintenanceCost(BigDecimal maintenanceCost);

    String getStatus();

    void setStatus(String status);

    String getRecommendedOccurenceRate();

    void setRecommendedOccurenceRate(String recommendedOccurenceRate);

    int getFacilityId();

    void setFacilityId(int facilityId);
}
