package com.facility.model;

import java.math.BigDecimal;

/**
 * Class representing a facility problem, including description and repair cost
 */
public class FacilityProblemImpl implements FacilityProblem {

    private int id;
    private String problem_description;
    private BigDecimal repair_cost;
    private String status;
    private int facilityId;

    public FacilityProblemImpl(int id, String problem_description, BigDecimal repair_cost, String status, int facilityId) {
        this.id = id;
        this.problem_description = problem_description;
        this.repair_cost = repair_cost;
        this.status = status;
        this.facilityId = facilityId;
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
    public String getProblem_description() {
        return problem_description;
    }

    @Override
    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    @Override
    public BigDecimal getRepair_cost() {
        return repair_cost;
    }

    @Override
    public void setRepair_cost(BigDecimal repair_cost) {
        this.repair_cost = repair_cost;
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
    public int getFacilityId() {
        return facilityId;
    }

    @Override
    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public String toString() {
        return "FacilityProblemImpl{" +
                "id=" + id +
                ", problem_description='" + problem_description + '\'' +
                ", repair_cost=" + repair_cost +
                ", status='" + status + '\'' +
                ", facilityId=" + facilityId +
                '}';
    }
}
