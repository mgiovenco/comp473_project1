package com.facility.service;

import com.facility.dao.FacilityDao;
import com.facility.dao.UseDao;
import com.facility.model.FacilityUseImpl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Service for handling facility use type actions.
 */
public class UseService {

    private UseDao useDao;
    private FacilityDao facilityDao;

    public UseService() {

        this.useDao = new UseDao();
        this.facilityDao = new FacilityDao();
    }

    /**
     * Checks whether the facility is scheduled for use during the passed in start, end datetime, and facility id
     *
     * @param startDatetime
     * @param endDateTime
     * @param facilityId
     * @return
     * @throws Exception
     */
    public boolean isInUseDuringInterval(Timestamp startDatetime, Timestamp endDateTime, int facilityId) throws Exception {
        return useDao.isInUseDuringInterval(startDatetime, endDateTime, facilityId);
    }

    /**
     * Add a new use schedule
     *
     * @param startDatetime
     * @param endDateTime
     * @param custId
     * @param facilityId
     * @throws Exception
     */
    public void assignFacilityToUse(Timestamp startDatetime, Timestamp endDateTime, int custId, int facilityId) throws Exception {

        // First check if facility is in use during the interval)
        if (!useDao.isInUseDuringInterval(startDatetime, endDateTime, facilityId)) {
            useDao.createFacilityUse(startDatetime, endDateTime, custId, facilityId);
        } else {
            throw new Exception("FacilityImpl cannot be assigned for use, already scheduled for that time period");
        }
    }

    /**
     * Vacates a facility if currently in use
     *
     * @param facilityId
     */
    public void vacateFacility(int facilityId) {
        useDao.vacateFacility(facilityId);
    }

    /**
     * Returns all scheduled facility use entities
     *
     * @param facilityId
     * @return
     */
    public List<FacilityUseImpl> listActualUsage(int facilityId) {
        return useDao.selectAllFacilityUse(facilityId);
    }

    /**
     * Calculates the usage rate based on the capacity * the number of minutes needed to use facility (ex: 10 person room for 90 minutes = $900)
     *
     * @param facilityId
     * @param numOfMinutes
     * @return
     */
    public BigDecimal calcUsageRate(int facilityId, int numOfMinutes) throws Exception {
        int capacity = facilityDao.selectFacilityCapacity(facilityId);

        return new BigDecimal(capacity * numOfMinutes);
    }
}
