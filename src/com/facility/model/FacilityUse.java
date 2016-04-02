package com.facility.model;

import java.sql.Timestamp;

public interface FacilityUse {

    int getId();

    void setId(int id);

    Timestamp getStartDatetime();

    void setStartDatetime(Timestamp startDatetime);

    Timestamp getEndDatetime();

    void setEndDatetime(Timestamp endDatetime);

    int getCustId();

    void setCustId(int custId);

    String getStatus();

    void setStatus(String status);

    int getFacilityId();

    void setFacilityId(int facilityId);
}
