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

    private MaintenanceDao maintenanceDao;

    public MaintenanceService() {
        this.maintenanceDao = new MaintenanceDao();
    }

    /**
     * Create a new facility maintenance request
     *
     * @param facilityId
     * @param maintenanceDescription
     * @param maintenanceCost
     * @throws Exception
     */
    public void makeFacilityMaintRequest(int facilityId, String maintenanceDescription, BigDecimal maintenanceCost) throws Exception {
        maintenanceDao.createMaintenanceRequest(maintenanceDescription, maintenanceCost, facilityId);
    }

    /**
     * Schedules maintenance for a given facility for provided start datetime and end datetime
     *
     * @param facilityId
     * @param startDateTime
     * @param endDatetTime
     * @param maintenanceId
     * @return
     */
    public void scheduleMaintenance(int facilityId, Timestamp startDateTime, Timestamp endDatetTime, int maintenanceId) throws Exception {
        maintenanceDao.createMaintenceSchedule(facilityId, startDateTime, endDatetTime, maintenanceId);
    }

    /**
     * Calculates the maintenance cost for the facility based on what is currently scheduled and in PENDING state
     *
     * @param facilityId
     * @return
     */
    public BigDecimal calcMaintanceCostForFacility(int facilityId) {
        return maintenanceDao.calculatePendingMaintenanceCost(facilityId);
    }

    /**
     * Calculates the number of reported problems for a facility
     *
     * @return
     */
    public int calcProblemRateForFacility(int facilityId) {
        return maintenanceDao.getFacilityProblemCount(facilityId);
    }

    /**
     * Calculates the total downtime (in minutes) for pending maintenance items
     *
     * @param facilityId
     * @return
     */
    public int calcDownTimeForFacility(int facilityId) {
        return maintenanceDao.calculateDownTimeForFacility(facilityId);
    }

    /**
     * Lists all maintenance requests for a given facility
     *
     * @param facilityId
     * @return
     */
    public List<MaintenanceRequestImpl> listMaintRequests(int facilityId) {
        return maintenanceDao.selectAllMaintenanceRequests(facilityId);

    }

    /**
     * Lists all maintence entities for a given facility
     *
     * @return
     */
    public List<MaintenanceImpl> listMaintenance(int facilityId) {
        return maintenanceDao.selectAllMaintenance(facilityId);
    }

    /**
     * Lists all the problems for a given facility
     *
     * @param facilityId
     * @return
     */
    public List<FacilityProblemImpl> listFacilityProblems(int facilityId) {
        return maintenanceDao.selectAllFacilityProblems(facilityId);
    }
}
