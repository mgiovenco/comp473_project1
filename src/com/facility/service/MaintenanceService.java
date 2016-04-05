package com.facility.service;

import com.facility.dao.MaintenanceDao;
import com.facility.model.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Service for handling maintenance related requests
 */
public class MaintenanceService {

    private MaintenanceDao maintenanceDao;

    public MaintenanceDao getMaintenanceDao() {
        return maintenanceDao;
    }

    public void setMaintenanceDao(MaintenanceDao maintenanceDao) {
        this.maintenanceDao = maintenanceDao;
    }

    public void makeFacilityMaintRequest(Maintenance maintenance) throws Exception {
        maintenanceDao.createMaintenanceRequest(maintenance);
    }

    public List<FacilityProblem> listFacilityProblems(int facilityId) {
        return maintenanceDao.selectAllFacilityProblems(facilityId);
    }

    public List<MaintenanceRequest> listMaintRequests(int facilityId) {
        return maintenanceDao.selectAllMaintenanceRequests(facilityId);
    }

    public void scheduleMaintenance(MaintenanceSchedule maintenanceSchedule) throws Exception {
        maintenanceDao.createMaintenceSchedule(maintenanceSchedule);
    }

    public List<Maintenance> listMaintenance(Facility facility) {
        return maintenanceDao.selectAllMaintenance(facility);
    }

    public int calcProblemRateForFacility(Facility facility) {
        return maintenanceDao.getFacilityProblemCount(facility);
    }

    public BigDecimal calcMaintanceCostForFacility(Facility facility) {
        return maintenanceDao.calculatePendingMaintenanceCost(facility);
    }

    public int calcDownTimeForFacility(Facility facility) {
        return maintenanceDao.calculateDownTimeForFacility(facility);
    }

}
