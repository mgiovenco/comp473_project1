package com.facility.model;

import java.sql.Timestamp;

public interface MaintenanceSchedule {

    int getId();

    void setId(int id);

    Timestamp getStartDateTime();

    void setStartDateTime(Timestamp startDateTime);

    Timestamp getEndDateTime();

    void setEndDateTime(Timestamp endDateTime);

    String getStatus();

    void setStatus(String status);
}
