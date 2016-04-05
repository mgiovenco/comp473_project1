package com.facility.model;

import java.util.List;

/**
 * Class represents the building units (buildings which contain rooms)
 * that a company uses to support the activities of the business.
 */
public class FacilityImpl implements Facility {

    private int id;
    private String name;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private int capacity;
    private String owner;

    // Dependant object lists
    private List<FacilityDetail> facilityDetailList;
    private List<Maintenance> maintenanceList;
    private List<MaintenanceRequest> maintenanceRequestList;
    private List<FacilityProblem> facilityProblemList;
    private List<FacilityUse> facilityUseList;
    private List<Inspection> inspectionList;


    public FacilityImpl() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLine1() {
        return line1;
    }

    @Override
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @Override
    public String getLine2() {
        return line2;
    }

    @Override
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getZip() {
        return zip;
    }

    @Override
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public List<FacilityDetail> getFacilityDetailList() {
        return facilityDetailList;
    }

    @Override
    public void setFacilityDetailList(List<FacilityDetail> facilityDetailList) {
        this.facilityDetailList = facilityDetailList;
    }

    @Override
    public List<Maintenance> getMaintenanceList() {
        return maintenanceList;
    }

    @Override
    public void setMaintenanceList(List<Maintenance> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }

    @Override
    public List<MaintenanceRequest> getMaintenanceRequestList() {
        return maintenanceRequestList;
    }

    @Override
    public void setMaintenanceRequestList(List<MaintenanceRequest> maintenanceRequestList) {
        this.maintenanceRequestList = maintenanceRequestList;
    }

    @Override
    public List<FacilityProblem> getFacilityProblemList() {
        return facilityProblemList;
    }

    @Override
    public void setFacilityProblemList(List<FacilityProblem> facilityProblemList) {
        this.facilityProblemList = facilityProblemList;
    }

    @Override
    public List<FacilityUse> getFacilityUseList() {
        return facilityUseList;
    }

    @Override
    public void setFacilityUseList(List<FacilityUse> facilityUseList) {
        this.facilityUseList = facilityUseList;
    }

    @Override
    public List<Inspection> getInspectionList() {
        return inspectionList;
    }

    @Override
    public void setInspectionList(List<Inspection> inspectionList) {
        this.inspectionList = inspectionList;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "FacilityImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", capacity=" + capacity +
                ", owner='" + owner + '\'' +
                ", facilityDetailList=" + facilityDetailList +
                ", maintenanceList=" + maintenanceList +
                ", maintenanceRequestList=" + maintenanceRequestList +
                ", facilityProblemList=" + facilityProblemList +
                ", facilityUseList=" + facilityUseList +
                ", inspectionList=" + inspectionList +
                '}';
    }
}