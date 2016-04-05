package com.facility.model;

import java.sql.Timestamp;

public class MaintenanceScheduleImpl implements MaintenanceSchedule {
    private int id;
    private Timestamp startDateTime;
    private Timestamp endDateTime;
    private String status;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Timestamp getStartDateTime() {
        return startDateTime;
    }

    @Override
    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }

    @Override
    public Timestamp getEndDateTime() {
        return endDateTime;
    }

    @Override
    public void setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
