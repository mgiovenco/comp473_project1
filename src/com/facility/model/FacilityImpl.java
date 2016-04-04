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

    // Dependant object lists
    private List<FacilityDetailImpl> facilityDetailList;
    private List<MaintenanceImpl> maintenanceList;
    private List<MaintenanceScheduleImpl> maintenanceScheduleList;
    private List<MaintenanceRequestImpl> maintenanceRequestList;
    private List<FacilityProblemImpl> facilityProblemList;
    private List<FacilityUseImpl> facilityUseList;
    private List<InspectionImpl> inspectionList;


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
    public List<FacilityDetailImpl> getFacilityDetailList() {
        return facilityDetailList;
    }

    @Override
    public void setFacilityDetailList(List<FacilityDetailImpl> facilityDetailList) {
        this.facilityDetailList = facilityDetailList;
    }

    @Override
    public List<MaintenanceImpl> getMaintenanceList() {
        return maintenanceList;
    }

    @Override
    public void setMaintenanceList(List<MaintenanceImpl> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }

    @Override
    public List<MaintenanceScheduleImpl> getMaintenanceScheduleList() {
        return maintenanceScheduleList;
    }

    @Override
    public void setMaintenanceScheduleList(List<MaintenanceScheduleImpl> maintenanceScheduleList) {
        this.maintenanceScheduleList = maintenanceScheduleList;
    }

    @Override
    public List<MaintenanceRequestImpl> getMaintenanceRequestList() {
        return maintenanceRequestList;
    }

    @Override
    public void setMaintenanceRequestList(List<MaintenanceRequestImpl> maintenanceRequestList) {
        this.maintenanceRequestList = maintenanceRequestList;
    }

    @Override
    public List<FacilityProblemImpl> getFacilityProblemList() {
        return facilityProblemList;
    }

    @Override
    public void setFacilityProblemList(List<FacilityProblemImpl> facilityProblemList) {
        this.facilityProblemList = facilityProblemList;
    }

    @Override
    public List<FacilityUseImpl> getFacilityUseList() {
        return facilityUseList;
    }

    @Override
    public void setFacilityUseList(List<FacilityUseImpl> facilityUseList) {
        this.facilityUseList = facilityUseList;
    }

    @Override
    public List<InspectionImpl> getInspectionList() {
        return inspectionList;
    }

    @Override
    public void setInspectionList(List<InspectionImpl> inspectionList) {
        this.inspectionList = inspectionList;
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
                ", facilityDetailList=" + facilityDetailList +
                ", maintenanceList=" + maintenanceList +
                ", maintenanceScheduleList=" + maintenanceScheduleList +
                ", maintenanceRequestList=" + maintenanceRequestList +
                ", facilityProblemList=" + facilityProblemList +
                ", facilityUseList=" + facilityUseList +
                ", inspectionList=" + inspectionList +
                '}';
    }
}