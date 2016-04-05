package com.facility.model;

import java.math.BigDecimal;

public interface FacilityProblem {

    int getId();

    void setId(int id);

    String getProblemDescription();

    void setProblemDescription(String problemDescription);

    BigDecimal getRepairCost();

    void setRepairCost(BigDecimal repairCost);

    String getStatus();

    void setStatus(String status);

}
