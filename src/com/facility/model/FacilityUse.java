package com.facility.model;

import java.sql.Timestamp;
import java.util.List;

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

    List<CustomerImpl> getCustomerList();

    void setCustomerList(List<CustomerImpl> customerList);
}
