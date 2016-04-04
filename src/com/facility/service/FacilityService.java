package com.facility.service;

import com.facility.dao.FacilityDao;
import com.facility.model.FacilityDetailImpl;
import com.facility.model.FacilityImpl;

import java.util.List;

/**
 * Service for interacting with facility entities.
 */
public class FacilityService {

    /*private FacilityDao facilityDao;

    public FacilityService() {
        this.facilityDao = new FacilityDao();
    }

    public List<FacilityImpl> listFacilities() {
        return facilityDao.selectAll();
    }

    public FacilityImpl getFacilityInformation(int id) {
        return facilityDao.selectFacilityWithDetails(id);
    }

    public int requestAvailableCapacity(int id) throws Exception {
        return facilityDao.selectFacilityCapacity(id);
    }

    public void addNewFacility(FacilityImpl facilityImpl) throws Exception {
        facilityDao.createFacility(facilityImpl);
    }

    public void addFacilityDetail(FacilityDetailImpl facilityDetailImpl) throws Exception {
        facilityDao.createFacilityDetail(facilityDetailImpl);

    }

    public void removeFacility(int id) {
        facilityDao.deleteFacility(id);
    }*/
}
