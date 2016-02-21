package com.facility.service;

import com.facility.dao.UseDao;
import com.facility.model.FacilityUse;

import java.sql.Timestamp;
import java.util.List;

/**
 * Service for handling facility use type actions.
 */
public class UseService {

    private UseDao useDao;

    public UseService() {
        this.useDao = new UseDao();
    }

    /**
     * Checks whether the facility is scheduled for use during the passed in start, end datetime, and facility id
     * @return
     */
    public boolean isInUseDuringInterval(Timestamp startDatetime, Timestamp endDateTime, int facilityId) throws Exception {
        return useDao.isInUseDuringInterval(startDatetime, endDateTime, facilityId);
    }

    /**
     * Add a new use schedule
     *
     * @param facilityUse
     * @throws Exception
     */
    public void assignFacilityToUse(FacilityUse facilityUse) throws Exception {
        useDao.createFacilityUse(facilityUse);
    }

    /**
     * Vacates a facility if currently in use
     * @return
     */
    public void vacateFacility(int facilityId) {
        useDao.vacateFacility(facilityId);
    }

    /**
     * Returns all scheduled facility use entities
     * @return
     */
    public List<FacilityUse> listActualUsage(int facilityId) {
        return useDao.selectAllFacilityUse(facilityId);
    }

    // USE
    public Object calcUsageRate() { return null; }
}
