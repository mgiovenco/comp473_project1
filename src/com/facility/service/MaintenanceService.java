package com.facility.service;

import com.facility.dao.MaintenanceDao;
import com.facility.model.FacilityProblemImpl;
import com.facility.model.MaintenanceImpl;
import com.facility.model.MaintenanceRequestImpl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Service for handling maintenance related requests
 */
public class MaintenanceService {

    /*private MaintenanceDao maintenanceDao;

    public MaintenanceService() {
        this.maintenanceDao = new MaintenanceDao();
    }


    public void makeFacilityMaintRequest(int facilityId, String maintenanceDescription, BigDecimal maintenanceCost) throws Exception {
        maintenanceDao.createMaintenanceRequest(maintenanceDescription, maintenanceCost, facilityId);
    }


    public void scheduleMaintenance(int facilityId, Timestamp startDateTime, Timestamp endDatetTime, int maintenanceId) throws Exception {
        maintenanceDao.createMaintenceSchedule(facilityId, startDateTime, endDatetTime, maintenanceId);
    }


    public BigDecimal calcMaintanceCostForFacility(int facilityId) {
        return maintenanceDao.calculatePendingMaintenanceCost(facilityId);
    }


    public int calcProblemRateForFacility(int facilityId) {
        return maintenanceDao.getFacilityProblemCount(facilityId);
    }


    public int calcDownTimeForFacility(int facilityId) {
        return maintenanceDao.calculateDownTimeForFacility(facilityId);
    }


    public List<MaintenanceRequestImpl> listMaintRequests(int facilityId) {
        return maintenanceDao.selectAllMaintenanceRequests(facilityId);

    }


    public List<MaintenanceImpl> listMaintenance(int facilityId) {
        return maintenanceDao.selectAllMaintenance(facilityId);
    }


    public List<FacilityProblemImpl> listFacilityProblems(int facilityId) {
        return maintenanceDao.selectAllFacilityProblems(facilityId);
    }*/
}
