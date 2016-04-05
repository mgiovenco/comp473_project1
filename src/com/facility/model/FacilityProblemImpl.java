package com.facility.model;

import java.math.BigDecimal;

/**
 * Class representing a facility problem, including description and repair cost
 */
public class FacilityProblemImpl implements FacilityProblem {

    private int id;
    private String problemDescription;
    private BigDecimal repairCost;
    private String status;

    public FacilityProblemImpl() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getProblemDescription() {
        return problemDescription;
    }

    @Override
    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    @Override
    public BigDecimal getRepairCost() {
        return repairCost;
    }

    @Override
    public void setRepairCost(BigDecimal repairCost) {
        this.repairCost = repairCost;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FacilityProblemImpl{" +
                "id=" + id +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairCost=" + repairCost +
                ", status='" + status + '\'' +
                '}';
    }
}
