package com.facility.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public interface MaintenanceRequest {

    int getId();

    void setId(int id);

    String getMaintenanceDescription();

    void setMaintenanceDescription(String maintenanceDescription);

    Timestamp getRequestedDateTime();

    void setRequestedDateTime(Timestamp requestedDateTime);

    BigDecimal getMaintenanceCost();

    void setMaintenanceCost(BigDecimal maintenanceCost);

    String getStatus();

    void setStatus(String status);
}
