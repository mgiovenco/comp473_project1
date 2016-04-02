package com.facility.model;

import java.sql.Timestamp;

public interface Inspection {

    int getId();

    void setId(int id);

    String getType();

    void setType(String type);

    Timestamp getRequestedDateTime();

    void setRequestedDateTime(Timestamp requestedDateTime);

    Timestamp getInspectionDateTime();

    void setInspectionDateTime(Timestamp inspectionDateTime);

    String getStatus();

    void setStatus(String status);

    int getFacilityId();

    void setFacilityId(int facilityId);
}
