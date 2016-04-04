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

    /*private UseDao useDao;
    private FacilityDao facilityDao;

    public UseService() {

        this.useDao = new UseDao();
        this.facilityDao = new FacilityDao();
    }


    public boolean isInUseDuringInterval(Timestamp startDatetime, Timestamp endDateTime, int facilityId) throws Exception {
        return useDao.isInUseDuringInterval(startDatetime, endDateTime, facilityId);
    }


    public void assignFacilityToUse(Timestamp startDatetime, Timestamp endDateTime, int custId, int facilityId) throws Exception {

        // First check if facility is in use during the interval)
        if (!useDao.isInUseDuringInterval(startDatetime, endDateTime, facilityId)) {
            useDao.createFacilityUse(startDatetime, endDateTime, custId, facilityId);
        } else {
            throw new Exception("FacilityImpl cannot be assigned for use, already scheduled for that time period");
        }
    }


    public void vacateFacility(int facilityId) {
        useDao.vacateFacility(facilityId);
    }


    public List<FacilityUseImpl> listActualUsage(int facilityId) {
        return useDao.selectAllFacilityUse(facilityId);
    }


    public BigDecimal calcUsageRate(int facilityId, int numOfMinutes) throws Exception {
        int capacity = facilityDao.selectFacilityCapacity(facilityId);

        return new BigDecimal(capacity * numOfMinutes);
    }*/
}
