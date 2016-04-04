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
    public String toString() {
        return "FacilityProblemImpl{" +
                "id=" + id +
                ", problem_description='" + problem_description + '\'' +
                ", repair_cost=" + repair_cost +
                ", status='" + status + '\'' +
                '}';
    }
}
