package com.facility.model;

import java.math.BigDecimal;

public interface FacilityProblem {

    int getId();

    void setId(int id);

    String getProblem_description();

    void setProblem_description(String problem_description);

    BigDecimal getRepair_cost();

    void setRepair_cost(BigDecimal repair_cost);

    String getStatus();

    void setStatus(String status);

}
