package com.facility.service;

import com.facility.dao.FacilityDao;
import com.facility.dao.UseDao;
import com.facility.model.Facility;
import com.facility.model.FacilityUse;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Service for handling facility use type actions.
 */
public class UseService {

    private UseDao useDao;
    private FacilityDao facilityDao;

    public List<FacilityUse> listActualUsage(int facilityId) {
        return useDao.selectAllFacilityUse(facilityId);
    }

    public boolean isInUseDuringInterval(Timestamp startDatetime, Timestamp endDateTime, int facilityId) throws Exception {
        List<FacilityUse> facilityUses = useDao.selectAllFacilityUse(facilityId);

        boolean inUse = false;

        for (FacilityUse facilityUse : facilityUses) {
            if (facilityUse.getEndDatetime().getTime() > startDatetime.getTime() && facilityUse.getStartDatetime().getTime() < endDateTime.getTime()) {
                inUse = true;
                break;
            }
        }
        return inUse;
    }

    public void assignFacilityToUse(FacilityUse facilityUse, int facilityId) throws Exception {
        // First check if facility is in use during the interval)
        if (!isInUseDuringInterval(facilityUse.getStartDatetime(), facilityUse.getEndDatetime(), facilityId)) {
            useDao.createFacilityUse(facilityUse);
        } else {
            throw new Exception("Facility cannot be assigned for use, already scheduled for that time period");
        }
    }

    public void vacateFacility(FacilityUse facilityUse) {
        useDao.vacateFacility(facilityUse);
    }

    public BigDecimal calcUsageRate(Facility facility, int numOfMinutes) throws Exception {
        return new BigDecimal(facility.getCapacity() * numOfMinutes);
    }

    public UseDao getUseDao() {
        return useDao;
    }

    public void setUseDao(UseDao useDao) {
        this.useDao = useDao;
    }

    public FacilityDao getFacilityDao() {
        return facilityDao;
    }

    public void setFacilityDao(FacilityDao facilityDao) {
        this.facilityDao = facilityDao;
    }

}
